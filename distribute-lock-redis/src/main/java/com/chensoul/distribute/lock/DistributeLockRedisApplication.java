package com.chensoul.distribute.lock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DistributeLockRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistributeLockRedisApplication.class, args);
	}

}
