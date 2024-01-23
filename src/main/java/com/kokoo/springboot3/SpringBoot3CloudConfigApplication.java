package com.kokoo.springboot3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringBoot3CloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3CloudConfigApplication.class, args);
	}

}
