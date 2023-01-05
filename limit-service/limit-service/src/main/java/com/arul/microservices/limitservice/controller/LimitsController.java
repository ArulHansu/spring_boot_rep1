package com.arul.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arul.microservices.limitservice.bean.Limits;
import com.arul.microservices.limitservice.configurations.Configurations;

@RestController
public class LimitsController {
	
	@Autowired
	private Configurations vConfig;
	
	
	@GetMapping("/limits")
	public Limits reterieveLimits() {
		return new Limits(vConfig.getMinimum(), vConfig.getMaximum());
		//return new Limits(1,1000);
	}

}
