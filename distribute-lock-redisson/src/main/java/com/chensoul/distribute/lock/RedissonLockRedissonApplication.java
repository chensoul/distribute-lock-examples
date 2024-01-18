package com.chensoul.distribute.lock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:redisson.xml")
public class RedissonLockRedissonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedissonLockRedissonApplication.class, args);
    }

}
