package com.infosys.sim_activation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.sim_activation.model.SimDetails;

@Repository
public interface SimRepository extends JpaRepository<SimDetails, Integer> {

	
	   List<SimDetails> findById(int id);
	   
	 //  List<SimDetails> findByserviceNumberAndsimNumber(Long id1,Long id2);
	   
	
}
