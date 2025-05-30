package com.ibm.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
