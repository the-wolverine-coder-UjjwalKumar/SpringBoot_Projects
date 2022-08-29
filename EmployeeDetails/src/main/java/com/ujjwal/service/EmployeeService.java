package com.ujjwal.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ujjwal.model.Employee;
import com.ujjwal.repository.EmployeeReposiotry;

@Service
public class EmployeeService implements InterfaceEmployeeService {

	List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(1, "UJJWAL", "SDE"),
			new Employee(2, "RAM", "HR"), new Employee(3, "LALBIHARI", "INTERN")));

	@Autowired
	private EmployeeReposiotry employeeRepository;

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();

	}

	@Override
	public Employee getEmployeeByID(int empID) {
		return employeeRepository.getOne(empID);
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeRepository.save(emp);

	}

	@Override
	public void updateEmployee(Employee emp, int empID) {
		employeeRepository.save(emp);
	}

	@Override
	public void deleteEmployee(int empID) {
		employeeRepository.deleteById(empID);

	}

//	@Override
//	public List<Employee> getEmployeeByDept(String deptName) {
//		return employeeRepository.findByDeptName(deptName);
//	}
}
