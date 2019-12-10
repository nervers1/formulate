package kr.or.formulate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication(scanBasePackages = "kr.or.formulate")
public class FormulateApplication {

    public static void main(String[] args) {
        SpringApplication.run(FormulateApplication.class, args);
    }

}
