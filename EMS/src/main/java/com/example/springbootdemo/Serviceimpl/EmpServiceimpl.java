package com.example.springbootdemo.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo.Repository.EmpRepository;
import com.example.springbootdemo.Service.EmpService;
import com.example.springbootdemo.entity.Emp;
@Service
public class EmpServiceimpl implements EmpService {
	@Autowired
	private EmpRepository emprepository;

	@Override
	public Emp saveEmp(Emp emp) {
		// TODO Auto-generated method stub
		return emprepository.save(emp);
	}

	@Override
	public List<Emp> getAllEmp() {
		// TODO Auto-generated method stub
		return emprepository.findAll();
	}
	
	@Override
	public Emp getEmpById(int Eid) {
		// TODO Auto-generated method stub
		return emprepository.findById(Eid).get();
	}

	@Override
	public Emp updEmpById(Emp emp, int Eid) {
		// TODO Auto-generated method stub
		Emp existingemp=emprepository.findById(Eid).get();
		return emprepository.save(existingemp);
	}
	@Override
	public void delEmp(int Eid) {
		// TODO Auto-generated method stub
		emprepository.deleteById(Eid);
	}


	

}
