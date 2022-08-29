package com.ujjwal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ujjwal.component.RunAfterStartup;

@RestController
public class ThreadController {

	@Autowired
	private RunAfterStartup runAfterStartup;

	@GetMapping("/call-thread")
	public String getScheduler() {
		runAfterStartup.callScheduler();
		return "called thread, Please wait!!";
	}
}
