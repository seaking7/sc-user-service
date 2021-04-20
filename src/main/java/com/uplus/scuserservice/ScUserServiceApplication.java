package com.uplus.scuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ScUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScUserServiceApplication.class, args);
	}

}
