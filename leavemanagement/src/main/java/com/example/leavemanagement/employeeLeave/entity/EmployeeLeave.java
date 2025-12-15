package com.example.leavemanagement.employeeLeave.entity;

import java.time.LocalDate;
import java.util.Optional;

import com.example.leavemanagement.employee.entity.Employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EmployeeLeave {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String leaveType;
	private String reason;
	private LocalDate leaveDate;
	private LocalDate leaveEndDate;
	
	@ManyToOne
	@JoinColumn(name="emplyee_id")
	private Optional<Employee> employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public LocalDate getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(LocalDate leaveDate) {
		this.leaveDate = leaveDate;
	}

	public LocalDate getLeaveEndDate() {
		return leaveEndDate;
	}

	public void setLeaveEndDate(LocalDate leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}

	public Optional<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Optional<Employee> emp) {
		this.employee = emp;
	}
	
	

}
