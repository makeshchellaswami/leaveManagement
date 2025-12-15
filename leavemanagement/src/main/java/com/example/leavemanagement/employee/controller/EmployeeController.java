package com.example.leavemanagement.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.leavemanagement.employee.entity.Employee;
import com.example.leavemanagement.employee.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empServ;

	@PostMapping
	public Employee saveEmployee(@RequestBody Employee employee) {
		return empServ.saveEmployee(employee);
	}
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
		return empServ.getAllEmployees();
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return empServ.getEmployeeById(id);
	}
}
