package com.example.leavemanagement.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leavemanagement.employee.entity.Employee;
import com.example.leavemanagement.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}
	
	public Optional<Employee> getEmployeeById(int id) {
		return empRepo.findById(id);
	}
	
	public Employee saveEmployee(Employee employee) {
		return empRepo.save(employee);
	}

}
