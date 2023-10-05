//package com.shop.onlineshop;
//
//import com.shop.onlineshop.containers.ContainerTest;
//import com.shop.onlineshop.containers.PostgresTestContainer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
//import org.springframework.context.annotation.Bean;
//import org.springframework.test.context.ActiveProfiles;
//import org.testcontainers.containers.PostgreSQLContainer;
//import org.testcontainers.utility.DockerImageName;
//
//@TestConfiguration(proxyBeanMethods = false)
//@ActiveProfiles(value = "test")
////@ContainerTest
//public class TestOnlineShopApplication {
//
////	@Bean
////	@ServiceConnection
////	PostgreSQLContainer<?> postgresContainer() {
////		return new PostgreSQLContainer<>(DockerImageName.parse("postgres:latest"));
////	}
//
////	@Autowired
////	private PostgreSQLContainer<PostgresTestContainer> postgresContainer;
//
//	public static void main(String[] args) {
//		SpringApplication.from(OnlineShopApplication::main).with(TestOnlineShopApplication.class).run(args);
//	}
//}
