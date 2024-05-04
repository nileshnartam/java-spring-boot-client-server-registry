package com.configuration.business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.configuration.business.entity.Configuration;
import com.configuration.business.service.IConfigurationService;

@RestController
@RequestMapping(value = "/configs")
public class CongfigurationController {
	@Autowired
	private IConfigurationService configService;
	@GetMapping
	public List<Configuration> getConfigs(){
		return configService.getConfigurations();
	}
}
