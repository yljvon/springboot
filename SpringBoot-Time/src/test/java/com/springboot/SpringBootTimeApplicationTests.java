package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTimeApplicationTests {

	@Test
    @Scheduled(cron = "0/2 * * * * *")
	public void contextLoads() {
		System.out.println("ss");
	}

}

