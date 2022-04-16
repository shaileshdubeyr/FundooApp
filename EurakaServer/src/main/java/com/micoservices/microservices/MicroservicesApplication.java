package com.micoservices.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author shailesh dubey
 * @Version 16.0.2
 * @Since 24-03-2022
 * eureka server main class
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplication.class, args);
	}

}
