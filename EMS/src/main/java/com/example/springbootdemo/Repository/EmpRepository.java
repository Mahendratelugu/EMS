package com.example.springbootdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootdemo.entity.Emp;
@Repository
public interface EmpRepository  extends JpaRepository<Emp,Integer>{

}
