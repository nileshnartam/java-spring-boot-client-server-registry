package com.configuration.business.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.configuration.business.entity.Configuration;
import com.configuration.business.entity.Signal;
@Service
public class ConfigurationServiceImpl implements IConfigurationService{
	@Autowired
	private RestTemplate restTemplate;
	List<Configuration> configs;
	@Override
	public List<Configuration> getConfigurations() {
		
		return configs;
	}

	@Override
	public void setConfigurations(List<Configuration> configs) {
		configs.forEach( config -> {
			Signal signals[] = restTemplate.getForObject("http://SIGNALS-MICROSERVICE/signals", Signal[].class);
			config.setSignals(Arrays.asList(signals));
		});
		this.configs = configs;
	}
	
}