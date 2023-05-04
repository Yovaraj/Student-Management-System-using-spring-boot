package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Student;
import com.product.repository.StuRepo;


@Service
public class StuService 

{
	@Autowired
	private StuRepo repo;
	public void addStu(Student e) 
	{
		repo.save(e);
	}
	public List<Student> getAllStu()
	{
		return repo.findAll();
	}
}
