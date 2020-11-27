package com.dao;

import com.appexception.AppException;
import com.model.Employee;

public interface EmployeeDao {
	Employee createEmployee(Employee emp) throws AppException;

	Employee readByEmpId(int empid) throws AppException;

	Employee readByEmpName(String empname) throws AppException;

	Employee updateEmployeeName(Employee emp) throws AppException;
	Employee updateEmployeeId(Employee emp) throws AppException;
	Employee updateEmployeeSalary(Employee emp) throws AppException;
	boolean deleteEmpById(int empid);

}
