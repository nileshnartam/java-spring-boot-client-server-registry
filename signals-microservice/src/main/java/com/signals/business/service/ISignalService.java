package com.signals.business.service;

import java.util.List;

import com.signals.business.vo.Signal;

public interface ISignalService {
	List<Signal> getSignals();
	void setSignals(List<Signal> signals);
}
