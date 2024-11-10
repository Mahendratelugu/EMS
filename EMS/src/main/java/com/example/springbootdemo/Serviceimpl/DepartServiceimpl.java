package com.example.springbootdemo.Serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo.Repository.DepartRepository;
import com.example.springbootdemo.Repository.EmpRepository;
import com.example.springbootdemo.Service.DepartService;
import com.example.springbootdemo.entity.Depart;
import com.example.springbootdemo.entity.Emp;
@Service
public class DepartServiceimpl  implements DepartService{
	@Autowired
	private DepartRepository departrepository;
	@Autowired
	private EmpRepository emprepository;

	@Override
	public Depart saveDepart(Depart depart) {
		// TODO Auto-generated method stub
		return departrepository.save(depart);
	}

	@Override
	public String assignEmpToDepart(int Eid, int did) {
		// TODO Auto-generated method stub
		Emp emp=emprepository.findById(Eid).get();
		Depart depart=departrepository.findById(did).get();
		List<Emp>Emplist=new ArrayList<>();
		Emplist.add(emp);
		departrepository.save(depart);
		return "assignment has done";
	}

}
