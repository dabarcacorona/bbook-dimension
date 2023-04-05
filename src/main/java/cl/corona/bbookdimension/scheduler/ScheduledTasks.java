package cl.corona.bbookdimension.scheduler;

import cl.corona.bbookdimension.model.BbookEnviaDimens;
import cl.corona.bbookdimension.repository.BbookEnviaDimensRepository;
import cl.corona.bbookdimension.services.DimensService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
public class ScheduledTasks {

    private static final Logger LOG = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Autowired
    private DimensService dimensService;

    private BbookEnviaDimensRepository bbookenviodimensrepository;


    @Autowired
    public ScheduledTasks(BbookEnviaDimensRepository bbookenviodimensrepository) {
        this.bbookenviodimensrepository = bbookenviodimensrepository;
    }

    @Scheduled(cron = "${cron.expression}")
    public void scheduledBbook() throws InterruptedException {
        LOG.info("{} : Generacion periodica para el envio de Colores  - {}",
                dateTimeFormatter.format(LocalDateTime.now()));

        // Date exceptions
        LocalDate today = LocalDate.now();
        int count = 0;
        List<BbookEnviaDimens> Bbookdimens = new ArrayList<>();

        try {
            String statusBrand = "T";
            Bbookdimens = (List<BbookEnviaDimens>) bbookenviodimensrepository.findAllByTranType("A");

        } catch (InvalidDataAccessResourceUsageException e) {
            LOG.error("{}: Ocurrio un error al momento de rescatar las Marcas: ", e);
            return;
        }

        LOG.info("Cantidad de Marcas para generar: {}", Bbookdimens.size());

        if (Bbookdimens.size() > 0) {
            dimensService.EnvioDimens(Bbookdimens, "A");
        }

        try {
            String statusBrand = "T";
            Bbookdimens = (List<BbookEnviaDimens>) bbookenviodimensrepository.findAllByTranType("C");

        } catch (InvalidDataAccessResourceUsageException e) {
            LOG.error("{}: Ocurrio un error al momento de rescatar las Marcas: ", e);
            return;
        }

        LOG.info("Cantidad de Marcas para generar: {}", Bbookdimens.size());

        if (Bbookdimens.size() > 0) {
            dimensService.EnvioDimens(Bbookdimens, "C");
        }

        try {
            String statusBrand = "T";
            Bbookdimens = (List<BbookEnviaDimens>) bbookenviodimensrepository.findAllByTranType("D");

        } catch (InvalidDataAccessResourceUsageException e) {
            LOG.error("{}: Ocurrio un error al momento de rescatar las Marcas: ", e);
            return;
        }

        LOG.info("Cantidad de Marcas para generar: {}", Bbookdimens.size());

        if (Bbookdimens.size() > 0) {
            dimensService.EnvioDimens(Bbookdimens, "D");
        }
    }
}