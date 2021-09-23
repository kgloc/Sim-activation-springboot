package com.infosys.sim_activation.model;

public class hold {
	public String email;
	public String dob;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public hold(String email, String dob) {
		super();
		this.email = email;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "hold [email=" + email + ", dob=" + dob + "]";
	}
	
	public hold() {
		
	}
	

}
