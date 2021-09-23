package com.infosys.sim_activation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.sim_activation.model.CustomerIdentity;

@Repository
public interface CustomerIdentityRepo extends JpaRepository<CustomerIdentity,Long > {
	

}
