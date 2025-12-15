package com.example.leavemanagement.employeeLeave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.leavemanagement.employeeLeave.dto.EmployeeLeaveDTO;
import com.example.leavemanagement.employeeLeave.entity.EmployeeLeave;
import com.example.leavemanagement.employeeLeave.service.EmployeeLeaveService;

@RestController
@RequestMapping("/api/leaves")
public class EmployeeLeaveController {
	
	@Autowired
	private EmployeeLeaveService empLeaveServ;
	
	@PostMapping
	public EmployeeLeave saveAll(EmployeeLeaveDTO dto) {
		return empLeaveServ.saveAll(dto);
	}
	
	@GetMapping
	public List<EmployeeLeave> getAllLeave(int empId){
		return empLeaveServ.getAllLeave(empId);
	}
}
