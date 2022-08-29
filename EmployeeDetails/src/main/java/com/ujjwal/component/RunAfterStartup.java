package com.ujjwal.component;

import java.util.Date;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class RunAfterStartup {
	
	public void callScheduler() {
		
		Timer timer = new Timer();
		MyTask task = new MyTask(new Date(), timer);
		//timer.scheduleAtFixedRate(task, new Date(), 2*60*1000);
		timer.scheduleAtFixedRate(task, 10*1000, 20*1000);
		//timer.schedule(task, 1*60*1000);
		
		
//		TestThreadExS task = new TestThreadExS();
//		
//		ScheduledExecutorService ss = Executors.newScheduledThreadPool(1);
//		ScheduledFuture<?> scheduledFuture = ss.scheduleAtFixedRate(task, 5, 1, TimeUnit.SECONDS);
		
		
	}

}
