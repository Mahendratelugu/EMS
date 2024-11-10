package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.Service.DepartService;
import com.example.springbootdemo.entity.Depart;
@RestController
public class DepartController {
	@Autowired
	private DepartService departservice;
	@PostMapping("/demo")
	public ResponseEntity<Depart>saveDepart(@RequestBody Depart depart)
	{
		return new ResponseEntity<Depart>(departservice.saveDepart(depart),HttpStatus.CREATED);
	}
	@PostMapping("")
	public ResponseEntity<String>assignEmpToDepart(@PathVariable("Eid")int Eid,@PathVariable("did")int did)
	{
		return new ResponseEntity<String>(departservice.assignEmpToDepart(Eid,did),HttpStatus.CREATED);
	}

}
