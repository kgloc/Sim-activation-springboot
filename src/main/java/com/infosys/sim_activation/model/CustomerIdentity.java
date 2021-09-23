package com.infosys.sim_activation.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class CustomerIdentity {
	@Id
	@NotNull
	private long uniqueIdNumber;
	private String dateOfbirth;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String state;
	
	public long getUniqueIdNumber() {
		return uniqueIdNumber;
	}
	public void setUniqueIdNumber(long uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}
	public String getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public CustomerIdentity(long uniqueIdNumber, String dateOfbirth, String firstName, String lastName,
			String emailAddress, String state) {
		
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		this.dateOfbirth = dateOfbirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.state = state;
	}
	public CustomerIdentity() {
		
	}
	
}
