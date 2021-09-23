package com.infosys.sim_activation.model;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;



@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private long uniqueIdNumber;
	
	@Column(name="Date_Of_Birth",nullable = false)
	
	private String DateOfBirth;
	
	@Column(name="Email_Address",nullable =false)
	private String emailAddress;
	
	@Column(name="first_name",nullable =false)
	private String firstName;
	
	@Column(name="last_name",nullable =false)
	private String lastName;
	
	@Column(name="Id_Type",nullable =false)
	private int idType;
	
	@Column(name="CustomerAddress_AddressId",nullable =false)
	private int customerAddress_addressId;
	
	@Column(name="SimId",nullable =false)
	private int simId;
	
	@Column(name="State",nullable =false)
	private String state;
	
	
	public Customer(long uniqueIdNumber, String dateOfBirth, String emailAddress, String firstName, String lastName,
			int idType, int customerAddress_addressId, int simId, String state) {
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		DateOfBirth = dateOfBirth;
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idType = idType;
		this.customerAddress_addressId = customerAddress_addressId;
		this.simId = simId;
		this.state = state;
	}
	public long getUniqueIdNumber() {
		return uniqueIdNumber;
	}
	public void setUniqueIdNumber(long uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
	public int getIdType() {
		return idType;
	}
	public void setIdType(int idType) {
		this.idType = idType;
	}
	public int getCustomerAddress_addressId() {
		return customerAddress_addressId;
	}
	public void setCustomerAddress_addressId(int customerAddress_addressId) {
		this.customerAddress_addressId = customerAddress_addressId;
	}
	public int getSimId() {
		return simId;
	}
	public void setSimId(int simId) {
		this.simId = simId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}
