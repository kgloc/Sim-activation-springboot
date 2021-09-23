package com.infosys.sim_activation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infosys.sim_activation.model.CustomerIdentity;

@Service
public interface BasicService {
	
	List<CustomerIdentity> findAll();
	CustomerIdentity savedetails1 (CustomerIdentity ob);

}
