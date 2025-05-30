package com.ibm.springbootcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibm.springbootcrud.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
