package com.ujjwal.component;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTask extends TimerTask {

	private Date startTime;
	private Timer timer;

	public MyTask(Date startTime, Timer timer) {
		super();
		this.startTime = startTime;
		this.timer = timer;
	}

	public MyTask() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside mytask :: " + (new Date()));
		Date currentTime = new Date();
		System.out.println("Diff = "+(currentTime.getTime() - this.startTime.getTime()));
//		if (currentTime.getTime() - this.startTime.getTime() >= 30* 60 * 1000) {
//			System.out.println("Killing thread!!");
//			timer.cancel();
//			System.out.println("Killed thread!!");
//		}
	}

}
