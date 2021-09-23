package com.infosys.sim_activation.controller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.sim_activation.model.CustomerIdentity;
import com.infosys.sim_activation.model.SimDetails;
import com.infosys.sim_activation.model.hold;
import com.infosys.sim_activation.service.BasicService;
import com.infosys.sim_activation.service.BasicServiceimpl;
import com.infosys.sim_activation.service.SimService;


import antlr.collections.List;

@RestController
public class basicController {

	@Autowired
	private SimService service;
	@Autowired
	private BasicService service1;
	@PostMapping(path="/detail")
	public CustomerIdentity identityobject(@RequestBody CustomerIdentity ob) {
		return service.savedetails1(ob);
	}
	@RequestMapping(value="/Test",method=RequestMethod.POST)
	@ResponseBody
	public String ValidateEmailandDob(@RequestBody hold h) {
		String email=h.getEmail();
		String dob=h.getDob();
		
		if(email==null || dob==null)
		{
			return "Email/Dob value is Required..";
		}
		SimpleDateFormat sdfrmt = new SimpleDateFormat("yyyy/MM/dd");
	    sdfrmt.setLenient(false);
	   
	    try
	    {
	        java.util.Date javaDate = sdfrmt.parse(dob); 
	        System.out.println(dob+" is valid date format");
	    }
	    /* Date format is invalid */
	    catch (ParseException e)
	    {
	        System.out.println(dob+" is Invalid Date format");
	        return "Invalid format of Date of birth";
	    }
		java.util.List<CustomerIdentity> customerint = service1.findAll();
		for(CustomerIdentity c: customerint)
		{
			String em=c.getEmailAddress();
			String dob1=c.getDateOfbirth();
			if(em.equalsIgnoreCase(email) || dob1.equalsIgnoreCase(dob))
			{
				return "Success"; 
			}
			
		}
		
		return "No request place for this order !";
		
	}
	
}
