package com.springboot.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimeController {
	@Scheduled(cron = "0/2 * * * * *")
	public void time() {
		Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd :HH-mm:ss");
		System.out.println("当前时间" + f.format(date));
	}
}
