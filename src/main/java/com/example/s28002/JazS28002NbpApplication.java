package com.example.s28002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class JazS28002NbpApplication {

	public static void main(String[] args) {
		SpringApplication.run(JazS28002NbpApplication.class, args);
	}

}
