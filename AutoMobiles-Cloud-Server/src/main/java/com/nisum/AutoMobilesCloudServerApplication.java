package com.nisum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AutoMobilesCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoMobilesCloudServerApplication.class, args);
	}
}
