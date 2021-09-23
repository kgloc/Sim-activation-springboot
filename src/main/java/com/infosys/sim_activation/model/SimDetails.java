package com.infosys.sim_activation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class SimDetails {
	
	@Id
	@NotNull
	private long simId;
	
	private long serviceNumber;
	private long simNumber;
	private String simStatus;
	
	public SimDetails() {
		
	}
	public long getSimId() {
		return simId;
	}
	public void setSimId(long simId) {
		this.simId = simId;
	}
	public long getServiceNumber() {
		return serviceNumber;
	}
	public void setServiceNumber(long serviceNumber) {
		this.serviceNumber = serviceNumber;
	}
	public long getSimNumber() {
		return simNumber;
	}
	public void setSimNumber(long simNumber) {
		this.simNumber = simNumber;
	}
	public String getSimStatus() {
		return simStatus;
	}
	public void setSimStatus(String simStatus) {
		this.simStatus = simStatus;
	}
	public SimDetails(long simId, long serviceNumber, long simNumber, String simStatus) {
		super();
		this.simId = simId;
		this.serviceNumber = serviceNumber;
		this.simNumber = simNumber;
		this.simStatus = simStatus;
	}
	
	@Override
	public String toString() {
		return "SimDetails [simId=" + simId + ", serviceNumber=" + serviceNumber + ", simNumber=" + simNumber
				+ ", simStatus=" + simStatus + "]";
	}
}
