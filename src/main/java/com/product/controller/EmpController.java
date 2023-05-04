package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.product.entity.Student;
import com.product.service.StuService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmpController {
	
	@Autowired
	private StuService service;
	
	@GetMapping("/")
	public String home(Model m)
	{
		List<Student> stu = service.getAllStu();
		m.addAttribute("stu",stu);
		return "index";
	}
	
	@GetMapping("/addstudent")
	public String addStudentForm() 
	{
		return "add_student";
	}
	
	@PostMapping("/register")
	public String stuRegister(@ModelAttribute Student e)
	{
		System.out.println(e);
		service.addStu(e);
		return "redirect:/";
	}
	@GetMapping("/about")
	public String aboutCollege()
	{
		return "about_college";
	}
	
}
