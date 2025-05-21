package com.ibm.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ibm.login.entities.Employee;
import com.ibm.login.services.EmployeeService;

@Controller
@RequestMapping("/employee1")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/form")
	public String addEmployee(Model model) {
		model.addAttribute("employee1", new Employee());
		return "AddEmployee";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("employee1") Employee employee) {
		employeeService.saveEmployeedetails(employee);
		//return "redirect:/employee1";
		return "Employee-list";
	}
	

}
