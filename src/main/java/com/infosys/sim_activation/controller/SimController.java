package com.infosys.sim_activation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.sim_activation.model.SimDetails;
import com.infosys.sim_activation.service.SimService;
import com.infosys.sim_activation.service.SimServiceimpl;

@RestController
public class SimController {
	
	@Autowired
	private SimService service;
	@PostMapping(path="/simdetail")
	public SimDetails getDetails(@RequestBody SimDetails ob) {
		return service.savedetails(ob);
	}
	
	
	
	
	/*
	@GetMapping("validate/num1/num2")
	public ResponseEntity<List<SimDetails>>getSimDetailByserviceNumberAndsimNumber(@RequestParam Long n1,@RequestParam Long n2) {
		return new ResponseEntity<>(service.getObject(n1,n2),HttpStatus.OK) ;
	} */

}
