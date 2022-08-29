package com.ujjwal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// employee properties defined in this class
@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //internally generated....
	@Column(name="empid")
	private int empID;
	@Column(name="emp_name")
	private String empName;
	@Column(name="dept_name")
	private String deptName;
	
	//adding default constructors..
	public Employee() {
	}
	
	//adding constructors...
	public Employee(int empID, String empName, String deptname) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.deptName = deptname;
	}
	
	//getters and setters...
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptname) {
		this.deptName = deptname;
	}

}
