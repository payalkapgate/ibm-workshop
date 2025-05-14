package com.ibm.springjdbc;

import java.util.List;

import javax.sql.DataSource;

public interface EmployeeDAO {
	public void setDataSource(DataSource ds);
	public void create(String firstName, String lastName, Integer salary);
	public Employee getEmployee(Integer id);
	public List<Employee> listEmployee();
	public void delete(Integer id);
	public void update(Integer id, String firstName, String lastName);

}
