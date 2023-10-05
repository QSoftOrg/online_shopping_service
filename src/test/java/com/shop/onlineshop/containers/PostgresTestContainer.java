package com.shop.onlineshop.containers;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;

public class PostgresTestContainer extends PostgreSQLContainer<PostgresTestContainer> {
    private static final String IMAGE_VERSION = "postgres:11-alpine";
    private static PostgresTestContainer container;
    private PostgresTestContainer() {
        super(IMAGE_VERSION);
    }
    public static PostgresTestContainer getInstance() {
        if (container == null) {
            container = new PostgresTestContainer();
        }
        return container;
    }

//    @Override
//    public void start() {
//        super.start();
//        System.setProperty("DB_URL", container.getJdbcUrl());
//        System.setProperty("DB_USERNAME", container.getUsername());
//        System.setProperty("DB_PASSWORD", container.getPassword());
//    }


//    @DynamicPropertySource
//    static void postgresqlProperties(DynamicPropertyRegistry registry) {
//        container.start();
//        registry.add("spring.datasource.url", container::getJdbcUrl);
//        registry.add("spring.datasource.username", container::getUsername);
//        registry.add("spring.datasource.password", container::getPassword);
//        registry.add("spring.liquibase.contexts", () -> "!prod");
//    }
    @Override
    public void stop() {
        //do nothing, JVM handles shut down
    }
}
