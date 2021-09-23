package com.infosys.sim_activation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.sim_activation.model.CustomerIdentity;
import com.infosys.sim_activation.model.SimDetails;
import com.infosys.sim_activation.repository.CustomerIdentityRepo;
import com.infosys.sim_activation.repository.SimRepository;

@Service
public class SimServiceimpl implements SimService {

	
	@Autowired
	private SimRepository repo;
	@Autowired 
	private CustomerIdentityRepo repo1;
	@Override
	public SimDetails savedetails(SimDetails ob) {
		return repo.save(ob);
	}
	
	/*
	@Override
	public List<SimDetails> getObject(Long n1, Long n2) {
		repo.findByserviceNumberAndsimNumber(n1, n2);
		return null;
	}
	*/
	@Override
	public CustomerIdentity savedetails1(CustomerIdentity ol) {
		// TODO Auto-generated method stub
		return repo1.save(ol);
	}
	

}
