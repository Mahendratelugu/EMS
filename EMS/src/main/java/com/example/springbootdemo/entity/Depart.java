package com.example.springbootdemo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Depart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int did;
	@Column(name="Departmentname")
	@JsonProperty("dname")
	private String dname;
	public Depart ()
	{
		
	}
	
	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Depart [did=" + did + ", dname=" + dname + "]";
	}
	@OneToMany(mappedBy="depart",cascade=CascadeType.ALL)
	@JsonIgnoreProperties("depart")
	private List<Emp> emp;	
	
	
	}
	


