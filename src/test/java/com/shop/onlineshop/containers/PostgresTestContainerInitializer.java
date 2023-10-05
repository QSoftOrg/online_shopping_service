package com.shop.onlineshop.containers;

import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class PostgresTestContainerInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    PostgresTestContainer postgresTestContainer = PostgresTestContainer.getInstance();

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        postgresTestContainer.start();
        TestPropertyValues.of(
                "spring.datasource.url=" + postgresTestContainer.getJdbcUrl(),
                "spring.datasource.username=" + postgresTestContainer.getUsername(),
                "spring.datasource.password=" + postgresTestContainer.getPassword()
        ).applyTo(applicationContext.getEnvironment());
    }
}
