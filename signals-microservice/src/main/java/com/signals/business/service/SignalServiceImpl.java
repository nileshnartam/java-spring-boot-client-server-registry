package com.signals.business.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.signals.business.vo.Signal;

@Service
public class SignalServiceImpl implements ISignalService{
	private List<Signal> signals;
	@Override
	public List<Signal> getSignals() {
		return signals;
	}
	@Override
	public void setSignals(List<Signal> signals) {
		this.signals = signals;
	}
	
}
