package com.ibm.springbootcrud.services;

import java.util.List;

import com.ibm.springbootcrud.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployees();
	public Employee createEmployee(Employee employee);
	public Employee getEmployeeById(Long id);
	public Employee updateEmployee(Long id, Employee employeeDetails);
	public void deleteEmployee(Long id);
	

}
