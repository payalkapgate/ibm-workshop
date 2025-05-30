package com.ibm.springbootcrud.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.springbootcrud.model.Employee;
import com.ibm.springbootcrud.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private final EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		 
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<Employee> getAllEmployees() {
		 return employeeRepository.findAll();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		 
		 return employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		 return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found with id: "+id));
	}

	@Override
	public Employee updateEmployee(Long id, Employee employeeDetails) {
		 Employee employee = getEmployeeById(id);
		 employee.setFirstName(employeeDetails.getFirstName());
		 employee.setLastName(employeeDetails.getLastName());
		 employee.setEmail(employeeDetails.getEmail());
		 return employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		 Employee employee = getEmployeeById(id);
		 employeeRepository.delete(employee);
		
	}
	

}
