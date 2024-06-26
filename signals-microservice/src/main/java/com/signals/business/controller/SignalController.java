package com.signals.business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.signals.business.service.ISignalService;
import com.signals.business.vo.Signal;

@RestController
@RequestMapping(value = "/signals")
public class SignalController {
	@Autowired
	private ISignalService signalService;
	@GetMapping
	List<Signal> getSignals(){
		return signalService.getSignals();
	}
}
