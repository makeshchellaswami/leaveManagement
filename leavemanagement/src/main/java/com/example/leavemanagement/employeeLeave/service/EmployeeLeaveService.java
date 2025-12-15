package com.example.leavemanagement.employeeLeave.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.leavemanagement.employee.entity.Employee;
import com.example.leavemanagement.employee.service.EmployeeService;
import com.example.leavemanagement.employeeLeave.dto.EmployeeLeaveDTO;
import com.example.leavemanagement.employeeLeave.entity.EmployeeLeave;
import com.example.leavemanagement.employeeLeave.repository.EmployeeLeaveRepository;

@Service
public class EmployeeLeaveService {
	
	@Autowired
	private EmployeeService empServ;
	
	@Autowired
	private EmployeeLeaveRepository empLeaveRepo;
	
	public EmployeeLeave saveAll(EmployeeLeaveDTO dto) {
		
		Optional<Employee> emp = empServ.getEmployeeById(dto.getEmployeeId());
		
		EmployeeLeave empLeav = new EmployeeLeave();
		
		empLeav.setEmployee(emp);
		empLeav.setLeaveType(dto.getLeaveType());
		empLeav.setLeaveDate(dto.getLeaveDate());
		empLeav.setLeaveEndDate(dto.getLeaveEndDate());
		
		return empLeav;	
	} 
	
	public List<EmployeeLeave> getAllLeave(int empId){
		return empLeaveRepo.findByEmployeeId(empId);
	}

}
