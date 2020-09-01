package com.fuse.api.service;


import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CurrentTimeService {
	
	@Autowired
	Environment env;
	
	public String getCurrentDateTime() {
		
		String message = env.getProperty("message");
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		return message.concat(localDateTime.toString());
		
	}

}
