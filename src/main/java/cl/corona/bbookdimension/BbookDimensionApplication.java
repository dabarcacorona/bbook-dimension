package cl.corona.bbookdimension;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BbookDimensionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BbookDimensionApplication.class, args);
	}

}
