package com.example.springbootdemo.Service;

import java.util.List;

import com.example.springbootdemo.entity.Emp;

public interface EmpService {
	Emp saveEmp (Emp emp);
	List<Emp> getAllEmp();
	Emp getEmpById(int Eid);
	Emp updEmpById (Emp emp,int Eid);
	void delEmp (int Eid);
	
	

}
