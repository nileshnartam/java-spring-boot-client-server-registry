package com.signals.business;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.signals.business.service.ISignalService;
import com.signals.business.vo.Signal;
@EnableDiscoveryClient
@SpringBootApplication
public class SignalsMicroserviceApplication implements CommandLineRunner{
	@Autowired
	private ISignalService signalService;
	
	public static void main(String[] args) {
		SpringApplication.run(SignalsMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Signal> signals = Arrays.asList(new Signal(1, "BTE101MS-1", new Date()), new Signal(2, "ATE101MS-2", new Date()), new Signal(3, "LTE101MS-3", new Date()));
		signalService.setSignals(signals);
	}
}