package com.fuse.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fuse.api.service.CurrentTimeService;

@RestController
public class CurrentTimeController {

	
	@Autowired
	CurrentTimeService currentTimeService;
	
	@RequestMapping(value = "/currentDateTime")
	public String getCurrentDateTime() {
		
		return currentTimeService.getCurrentDateTime();
		
		
	}
	
	
	
}
