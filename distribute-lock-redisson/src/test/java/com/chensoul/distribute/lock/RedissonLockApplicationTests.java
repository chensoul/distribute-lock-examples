package com.chensoul.distribute.lock;

import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class RedissonLockApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testRedissonLock() {
		Config config = new Config();
		config.useSingleServer().setAddress("redis://localhost:6379");
		RedissonClient redisson = Redisson.create(config);

		RLock rLock = redisson.getLock("order");

		try {
			rLock.lock(30, TimeUnit.SECONDS);
			log.info("我获得了锁！！！");
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			log.info("我释放了锁！！");
			rLock.unlock();
		}
	}

}
