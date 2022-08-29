package com.ujjwal.component;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
//@EnableScheduling
public class TestThread {
	
	@Scheduled(fixedDelay = 10*1000)
	public void print() {
		System.out.println("Inside my new task :: "+(LocalDateTime.now()));
	}

}
