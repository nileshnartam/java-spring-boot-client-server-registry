package com.configuration.business.service;

import java.util.List;

import com.configuration.business.entity.Configuration;

public interface IConfigurationService {
	List<Configuration> getConfigurations();
	void setConfigurations(List<Configuration> configs);
}
