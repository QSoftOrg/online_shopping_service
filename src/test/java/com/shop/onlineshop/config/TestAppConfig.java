package com.shop.onlineshop.config;

import com.shop.onlineshop.containers.PostgresTestContainer;
import org.junit.ClassRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@Configuration
public class TestAppConfig {

    @Bean
    @ServiceConnection
    public PostgreSQLContainer<PostgresTestContainer> postgresContainer() {
//        return new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"));
        return PostgresTestContainer.getInstance();
    }
//
//    @DynamicPropertySource
//    public void postgresqlProperties(@Autowired PostgreSQLContainer<PostgresTestContainer> postgresContainer, DynamicPropertyRegistry registry) {
//        postgresContainer.start();
//        registry.add("spring.datasource.url", postgresContainer::getJdbcUrl);
//        registry.add("spring.datasource.username", postgresContainer::getUsername);
//        registry.add("spring.datasource.password", postgresContainer::getPassword);
//        registry.add("spring.liquibase.contexts", () -> "!prod");
//    }
}
