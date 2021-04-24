package com.uplus.scuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableDiscoveryClient
public class ScUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScUserServiceApplication.class, args);
	}


	@Bean  // BCryptPasswordEncoder 클래스 Autowired처리위해서 사전에 Bean등록
	public BCryptPasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
}
