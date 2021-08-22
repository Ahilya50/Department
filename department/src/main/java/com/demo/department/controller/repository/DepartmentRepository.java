package com.demo.department.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.demo.department.controller.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	//Department saveDepartment(Department department);

	Department findBydeptId(Long departmentId);

}
