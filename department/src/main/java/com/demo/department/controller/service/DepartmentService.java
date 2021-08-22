
package com.demo.department.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.department.controller.entity.Department;
import com.demo.department.controller.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findBydeptId(departmentId);
	}

}
