package com.configuration.business.entity;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Configuration {
	private int id;
	private String configName;
	private List<Signal> signals;
	private Date created;
	public Configuration() {
		
	}
	public Configuration(int id, String configName, List<Signal> signals, Date created) {
		super();
		this.id = id;
		this.configName = configName;
		this.signals = signals;
		this.created = created;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConfigName() {
		return configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	public List<Signal> getSignals() {
		return signals;
	}
	public void setSignals(List<Signal> signals) {
		this.signals = signals;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public int hashCode() {
		return Objects.hash(configName, created, id, signals);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Configuration other = (Configuration) obj;
		return Objects.equals(configName, other.configName) && Objects.equals(created, other.created) && id == other.id
				&& Objects.equals(signals, other.signals);
	}
	@Override
	public String toString() {
		return "Configuration [id=" + id + ", configName=" + configName + ", signals=" + signals + ", created="
				+ created + "]";
	}
}
