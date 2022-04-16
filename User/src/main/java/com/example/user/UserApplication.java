package com.example.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shailesh dubey
 * @Version 16.0.2
 * @Since 24-03-2022
 */
@SpringBootApplication
@EnableEurekaClient
@Slf4j
@EnableAspectJAutoProxy
@ComponentScan("com.example.user")
@Configuration
public class UserApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(UserApplication.class, args);
		log.info("User app is started {}  environment", context.getEnvironment().getProperty("environment"));
	}

}
