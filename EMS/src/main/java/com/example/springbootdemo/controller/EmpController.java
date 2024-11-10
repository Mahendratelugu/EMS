package com.example.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.Service.EmpService;
import com.example.springbootdemo.entity.Emp;
@RestController
@RequestMapping("/demo")
public class EmpController {
	@Autowired
	private EmpService empservice;

	@PostMapping("/addEmp")
	public ResponseEntity<Emp>saveEmp(@RequestBody Emp emp)
	{
		return new ResponseEntity<Emp>(empservice.saveEmp(emp),HttpStatus.CREATED);
	}
	@GetMapping("/Emp")
	public List<Emp> getEmp()
	{
		List<Emp>el=empservice.getAllEmp();
		return el;
	}
	@GetMapping("/getEmpById/{Eid}")
	public ResponseEntity<Emp>getEmpById(@PathVariable("Eid") int Eid)
	{
		return new ResponseEntity<Emp>(empservice.getEmpById(Eid),HttpStatus.OK);
	}

	@PutMapping("/updEmpById/{Eid}")
	public ResponseEntity<Emp> updEmpById(@PathVariable("Eid") Emp emp)
	{

		return new ResponseEntity<Emp>(empservice.saveEmp(emp),HttpStatus.OK);
	}
	@DeleteMapping("/delEmp/{Eid}")
	public ResponseEntity<String> delEmp(@PathVariable("Eid")int Eid)
	{
		empservice.delEmp(Eid);
		return new ResponseEntity<>("deleted",HttpStatus.ACCEPTED);
	}
}
