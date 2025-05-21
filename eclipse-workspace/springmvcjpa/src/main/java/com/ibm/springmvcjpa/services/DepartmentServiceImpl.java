package com.ibm.springmvcjpa.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springmvcjpa.entities.Department;
import com.ibm.springmvcjpa.repositories.DepartmentRepository;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		 
		return departmentRepository.findAll();
	}

	@Override
	public Department getDepartmentById(Long id) {
		 
		return departmentRepository.findById(id)
			.orElseThrow(() -> new RuntimeException("Department not found with id: "+id));
	}

	@Override
	public Department saveDepartment(Department department) {
		 
		return departmentRepository.save(department);
	}

	@Override
	public void deleteDepartment(Long id) {
		 
		departmentRepository.deleteById(id);
	}

	@Override
	public Department updateDepartment(Long id, Department department) {
		 Department existingDepartment = getDepartmentById(id);
		 existingDepartment.setName(department.getName());
		 return departmentRepository.save(existingDepartment);
	}

}