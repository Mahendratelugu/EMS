package com.example.springbootdemo.Service;

import com.example.springbootdemo.entity.Depart;

public interface DepartService {
	Depart saveDepart(Depart depart);
	String assignEmpToDepart(int Eid,int did);
}
