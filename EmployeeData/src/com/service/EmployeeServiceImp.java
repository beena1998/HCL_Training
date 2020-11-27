package com.service;

import com.appexception.AppException;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImp;
import com.model.Employee;

public class EmployeeServiceImp implements EmployeeService {

	@Override
	public Employee createEmployee(Employee emp) throws AppException {
		if (emp.getEmpname().length() < 20) {
			System.out.println("In EmpServiceImp");
			EmployeeDao empdao = new EmployeeDaoImp();
			emp = empdao.createEmployee(emp);
		}
		return emp;
	}

	@Override
	public Employee readByEmpId(int empid) throws AppException {
		Employee emp = null;
		if (Integer.toString(empid).length() <= 3) {
			System.out.println("In EmpServiceImp");
			EmployeeDao empdao = new EmployeeDaoImp();
			emp = empdao.readByEmpId(empid);
		} else {
			throw new AppException("Validation Fail!!");
		}
		return emp;
	}

	@Override
	public Employee readByEmpName(String empname) throws AppException {
		Employee emp = null;

		if (empname.length() <= 20) {
			System.out.println("In EmpServiceImp");
			EmployeeDao dao = new EmployeeDaoImp();
			emp = dao.readByEmpName(empname);
		}

		return emp;
	}

	@Override
	public Employee updateEmployeeName(Employee emp) throws AppException {
		System.out.println("In EmpServiceImp!!");
		if (Integer.toString(emp.getEmpid()).length() > 0) {
			EmployeeDao employeeDao = new EmployeeDaoImp();
			emp = employeeDao.updateEmployeeName(emp);
		} else {
			System.out.println("Validation fail..");
		}

		// Connection connection= MyConnection.getConnection();

		return emp;
	}

	@Override
	public Employee updateEmployeeId(Employee emp) throws AppException {
		System.out.println("In EmpServiceImp!!");
		if (emp.getEmpname().length() < 20) {
			EmployeeDao employeeDao = new EmployeeDaoImp();
			emp = employeeDao.updateEmployeeId(emp);
		} else {
			throw new AppException("Name is not valid!!");
		}
		return emp;
	}

	@Override
	public Employee updateEmployeeSalary(Employee emp) throws AppException {
		System.out.println("In EmpServiceImp!!");
		if (Integer.toString(emp.getEmpid()).length() > 0) {
			EmployeeDao employeeDao = new EmployeeDaoImp();
			emp = employeeDao.updateEmployeeSalary(emp);
		} else {
			throw new AppException("Id is not valid!!");
		}
		return emp;
	}

	@Override
	public boolean deleteEmpById(int empid) {
		boolean result = false;
		if ((Integer.toString(empid).length() > 0)) {
			EmployeeDao dao = new EmployeeDaoImp();
			result = dao.deleteEmpById(empid);

		}
		return result;
	}

}
