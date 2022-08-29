package com.ujjwal.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ujjwal.model.Employee;

@Service
public interface InterfaceEmployeeService {

	List<Employee> getAllEmployee();
	
	Employee getEmployeeByID(int id);

	void addEmployee(Employee emp);

	void updateEmployee(Employee emp, int empID);

	void deleteEmployee(int empID);

	//List<Employee> getEmployeeByDept(String deptName);

}
