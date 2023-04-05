package cl.corona.bbookdimension.repository;

import cl.corona.bbookdimension.model.BbookEnviaDimens;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BbookEnviaDimensRepository extends CrudRepository<BbookEnviaDimens, String> {

    public List<BbookEnviaDimens> findAllByTranType(String tranType);

    @Modifying(clearAutomatically = true)
    @Query(value = "update app_sam.sdi_sdibasatr s set s.download_date_1 = sysdate, s.observacion = :responses where rowid = :id", nativeQuery = true)
    public void updSdiSdibasatr(@Param("id") String id, @Param("responses") String responses);
}
