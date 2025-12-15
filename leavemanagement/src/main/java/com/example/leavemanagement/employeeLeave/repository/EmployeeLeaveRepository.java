package com.example.leavemanagement.employeeLeave.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.leavemanagement.employeeLeave.entity.EmployeeLeave;

public interface EmployeeLeaveRepository extends JpaRepository<EmployeeLeave,Integer> {
	
    List<EmployeeLeave> findByEmployeeId(Integer employeeId);

}
