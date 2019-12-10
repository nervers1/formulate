package kr.or.formulate.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoDriverInformation;
import com.mongodb.ServerAddress;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import java.util.Arrays;

@Configuration
@EnableReactiveMongoRepositories(basePackages = "kr.or.formulate.repository")
@EnableMongoAuditing
@EntityScan("kr.or.formulate.model")
@Lazy
public class ReactiveMongoConfiguration extends AbstractReactiveMongoConfiguration {

    @Value("${spring.data.mongodb.uri}")
    private String mongoUri;

    @Override
    public MongoClient reactiveMongoClient() {
//        ConnectionString string = new ConnectionString(mongoUri);
        return MongoClients.create(mongoUri);
    }

    @Override
    protected String getDatabaseName() {
        return "test";
    }
}
