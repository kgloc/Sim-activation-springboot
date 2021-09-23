package com.infosys.sim_activation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.infosys.sim_activation.model.CustomerIdentity;
import com.infosys.sim_activation.model.SimDetails;

@Service
public interface SimService {
	
      SimDetails savedetails(SimDetails ob);
      CustomerIdentity savedetails1(CustomerIdentity ol);
	// List<SimDetails> getObject(Long n1, Long n2);
}
