package com.ujjwal.component;

import org.springframework.stereotype.Component;

@Component
public class TestThreadExS implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside thread ");

	}

}
