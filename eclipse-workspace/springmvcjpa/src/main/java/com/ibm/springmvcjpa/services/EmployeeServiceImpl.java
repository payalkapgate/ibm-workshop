package com.ibm.springmvcjpa.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ibm.springmvcjpa.entities.Department;
import com.ibm.springmvcjpa.entities.Employee;
import com.ibm.springmvcjpa.repositories.DepartmentRepository;
import com.ibm.springmvcjpa.repositories.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private DepartmentService departmentService;

	@Override
	public List<Employee> getAllEmployees() {
		 
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
	 
		return employeeRepository.findById(id)
			.orElseThrow(() -> new RuntimeException("Employee not found with id: "+id));
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		 
		if (employee.getDepartment() != null && employee.getDepartment().getId() != null) {
		Department department = departmentService.getDepartmentById(employee.getDepartment().getId());
		employee.setDepartment(department);
		}
		return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		 employeeRepository.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		 Employee existingEmployee = getEmployeeById(id);
		 existingEmployee.setName(employee.getName());
		 if(employee.getDepartment()!=null && employee.getDepartment().getId()!=null) {
			 Department department = departmentService.getDepartmentById(employee.getDepartment().getId());
			 existingEmployee.setDepartment(department);
		 }
		 return employeeRepository.save(existingEmployee);
		 
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(Long departmentId) {
		 return employeeRepository.findByDepartmentId(departmentId);
	}

}