package com.signals.business.vo;

import java.util.Date;
import java.util.Objects;

public class Signal {
	private int id;
	private String signalName;
	private Date createdDate;
	public Signal() {

	}
	public Signal(int id, String signalName, Date createdDate) {
		super();
		this.id = id;
		this.signalName = signalName;
		this.createdDate = createdDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSignalName() {
		return signalName;
	}
	public void setSignalName(String signalName) {
		this.signalName = signalName;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public int hashCode() {
		return Objects.hash(createdDate, id, signalName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Signal other = (Signal) obj;
		return Objects.equals(createdDate, other.createdDate) && id == other.id
				&& Objects.equals(signalName, other.signalName);
	}
	@Override
	public String toString() {
		return "Signal [id=" + id + ", signalName=" + signalName + ", createdDate=" + createdDate + "]";
	}
}