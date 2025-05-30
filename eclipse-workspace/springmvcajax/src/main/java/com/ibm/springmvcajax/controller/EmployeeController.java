package com.ibm.springmvcajax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.ibm.springmvcajax.model.Employee;
import com.ibm.springmvcajax.services.EmployeeService;

import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

     
    @GetMapping("/employee/search")
    public String showSearchPage() {
        return "employeeSearch";
    }

     
    @GetMapping(value = "/employees/search/ajax", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Employee> searchEmployeesAjax(@RequestParam("term") String searchTerm) {
        return employeeService.searchEmployees(searchTerm);
    }
}
