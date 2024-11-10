package com.example.springbootdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springbootdemo.entity.Depart;

@Repository
public interface DepartRepository extends JpaRepository<Depart,Integer> {
	@Query("select d from Department d where d.deptName=?1")	
	Depart findByDeptName(String name);

}
