package com.ibm.springmvcajax.services;

import java.util.List;

import com.ibm.springmvcajax.model.Employee;

public interface EmployeeService {
	List<Employee> searchEmployees(String searchTerm);
}
