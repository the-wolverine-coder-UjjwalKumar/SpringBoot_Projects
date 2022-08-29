package com.ujjwal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ujjwal.model.Employee;

// CRUD implementation done in this interface after extending from JPARepository
@Repository 
public interface EmployeeReposiotry extends JpaRepository<Employee, Integer> {
	
//	@Query(value = "SELECT e FROM employee e WHERE e.dept_name=:deptName")
//	List<Employee> findByDeptName(String deptName);

}
