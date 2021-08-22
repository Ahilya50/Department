package com.demo.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.department.controller.entity.Department;
import com.demo.department.controller.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/department")
//@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		//log.info("");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/test")
	public String test()
	{
		return "Hello...WElcome!!!";
	}
	
	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable("id") Long departmentId)
	{
		return departmentService.findDepartmentById(departmentId);
	}
	
	 
}
