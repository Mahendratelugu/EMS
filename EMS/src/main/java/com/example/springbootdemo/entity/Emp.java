package com.example.springbootdemo.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employe")
public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty("Eid")
	private int Eid;
	@Column
	@JsonProperty("Ename")
	private String Ename;
	@Column
	@JsonProperty("Email")
	private String Email;
	@Column(name="MobileNo")
	@JsonProperty("Eph")
	private Long Eph;
	@Column(name="EmpAge")
	@JsonProperty("age")
	private int age;
	@Column(name="DateOfJoinning")
	@JsonProperty("doj")
	private Date doj;
	@Column(name="Salary")
	@JsonProperty("sal")
	private Double sal;
	public Emp ()
	{
		
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getEph() {
		return Eph;
	}
	public void setEph(Long eph) {
		Eph = eph;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [Eid=" + Eid + ", Ename=" + Ename + ", Email=" + Email + ", Eph=" + Eph + ", age=" + age + ", doj="
				+ doj + ", sal=" + sal + "]";
	}
	@ManyToOne
	@JoinColumn(name= "did")
	@JsonIgnoreProperties("Emp")
	private Depart depart;
	
}
