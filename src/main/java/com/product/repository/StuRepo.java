package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.entity.Student;


@Repository
public interface StuRepo extends JpaRepository<Student, Integer>{

}
