package com.shop.onlineshop;

import com.shop.onlineshop.containers.ContainerTest;
import com.shop.onlineshop.containers.PostgresTestContainer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.PostgreSQLContainer;

@SpringBootTest
@ActiveProfiles(value = "test")
//@ContainerTest
class OnlineShopApplicationTests {

	@Autowired
	private PostgreSQLContainer<PostgresTestContainer> postgresContainer;

	@Test
	void contextLoads() {
	}
}
