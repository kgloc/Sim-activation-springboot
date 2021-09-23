package com.infosys.sim_activation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.sim_activation.model.CustomerIdentity;
import com.infosys.sim_activation.model.SimDetails;
import com.infosys.sim_activation.repository.CustomerIdentityRepo;

@Service
public class BasicServiceimpl implements BasicService {

	@Autowired
	private CustomerIdentityRepo repo;
	
	@Override
	public CustomerIdentity savedetails1(CustomerIdentity ob) {
		return repo.save(ob);
	}
	
	@Override
	public List<CustomerIdentity> findAll() {
		
		// TODO Auto-generated method stub
		 return repo.findAll();
	}
}
