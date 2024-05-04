package com.configuration.business;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.configuration.business.entity.Configuration;
import com.configuration.business.service.IConfigurationService;
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigurationMicroserviceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationMicroserviceApplication.class, args);
	}

	@Autowired
	private IConfigurationService configService;
	
	@Override
	public void run(String... args) throws Exception {
		
		configService.setConfigurations(Arrays.asList(new Configuration(1, "MAC1CONFIG", null, new Date()), new Configuration(2, "MAC2CONFIG", null, new Date())));
	}

	
}
