package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.appexception.AppException;
import com.model.Employee;

import com.mysql.jdbc.PreparedStatement;

public class EmployeeDaoImp implements EmployeeDao {
	Scanner scan = null;

	@Override
	public Employee createEmployee(Employee emp) throws AppException {
		Connection connection = MyConnection.getConnection();
//		ResultSet resultSet = null;
		// Employee emp1=null;
		String query = "INSERT INTO employee(empid,empname,salary) VALUES(?,?,?) ";

		try {
			System.out.println("In EmpDaoImp");

			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);

			preparedStatement.setInt(1, emp.getEmpid());
			preparedStatement.setString(2, emp.getEmpname());

			preparedStatement.setDouble(3, emp.getSalary());

			int i = preparedStatement.executeUpdate();
			System.out.println(i + " records inserted");

			// ResultSet rs=preparedStatement.executeQuery();
			// while(rs.next()){
			// System.out.println(rs.getInt(1)+" "+rs.getString(2));
			// }

			// resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return emp;
	}

	@Override
	public Employee readByEmpId(int empid) throws AppException {
		Connection connection = MyConnection.getConnection();
		ResultSet resultSet = null;
		Employee emp = new Employee();
		String query = "SELECT * FROM employee WHERE empid=?";
		try {
			System.out.println("In EmpDaoImp");
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1, empid);

			resultSet = preparedStatement.executeQuery();

			emp = new Employee();
			// System.out.println(emp);
			while (resultSet.next()) {
				emp.setEmpid(resultSet.getInt("empid"));
				emp.setEmpname(resultSet.getString("empname"));

				emp.setSalary(resultSet.getFloat("salary"));
				System.out.println(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return emp;
	}

	@Override
	public Employee readByEmpName(String empname) throws AppException {
		Connection connection = MyConnection.getConnection();
		ResultSet resultSet = null;
		Employee emp = new Employee();
		String query = "SELECT * FROM employee WHERE empname=?";
		try {
			System.out.println("In UserDaoImp");
			PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setString(1, empname);

			resultSet = preparedStatement.executeQuery();

			emp = new Employee();
			// System.out.println(emp);
			while (resultSet.next()) {
				emp.setEmpid(resultSet.getInt("empid"));
				emp.setEmpname(resultSet.getString("empname"));

				emp.setSalary(resultSet.getFloat("salary"));
				System.out.println(emp);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

		return emp;

	}

	@Override
	public Employee updateEmployeeName(Employee emp) throws AppException {
		System.out.println("In UpdateEMployee!!");
	
		Connection connection= MyConnection.getConnection();
		String query="UPDATE employee SET empname=? where empid=? ";
		
		PreparedStatement preparedStatement=null;
//		ResultSet resultSet=null;
		try {
			preparedStatement=(PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setString(1,emp.getEmpname());
			preparedStatement.setInt(2,emp.getEmpid());
			
						
			int i=preparedStatement.executeUpdate();  
			System.out.println(i+" records updated");  
			
			EmployeeDao dao= new EmployeeDaoImp();
			emp=dao.readByEmpName(emp.getEmpname());
			
			
//			resultSet=preparedStatement.executeUpdate()();
//			while(resultSet.next()) {
//				
//				System.out.println("In res!");
//				emp.setEmpname(resultSet.getString("empname"));
//				emp.setSalary(resultSet.getFloat("salary"));
//				
//				EmployeeDao dao= new EmployeeDaoImp();
//				emp=dao.readByEmpName(emp.getEmpname());
//			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return emp;
	}
	@Override
	public Employee updateEmployeeId(Employee emp) throws AppException {
		Connection connection= MyConnection.getConnection();
		String query="UPDATE employee SET  empid=? where empname=?";
		
		PreparedStatement preparedStatement=null;
		
		try {
			preparedStatement=(PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setInt(1,emp.getEmpid());
			preparedStatement.setString(2,emp.getEmpname());
			
			
			int i=preparedStatement.executeUpdate();  
			System.out.println(i+" records updated");  
			
			EmployeeDao dao= new EmployeeDaoImp();
			emp=dao.readByEmpName(emp.getEmpname());
		}
catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public Employee updateEmployeeSalary(Employee emp) throws AppException {
		Connection connection= MyConnection.getConnection();
		String query="UPDATE employee SET  salary=? where empid=?";
		
		PreparedStatement preparedStatement=null;
//		ResultSet resultSet=null;
		try {
			preparedStatement=(PreparedStatement) connection.prepareStatement(query);
			preparedStatement.setFloat(1,emp.getSalary());
			preparedStatement.setInt(2,emp.getEmpid());
			
			int i=preparedStatement.executeUpdate();  
			System.out.println(i+" records updated");  
			EmployeeDao dao= new EmployeeDaoImp();
			emp=dao.readByEmpId(emp.getEmpid());
		}
catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return emp;
	}
	@Override
	public boolean deleteEmpById(int empid) {
		Connection connection = MyConnection.getConnection();

		Employee emp = new Employee();
		EmployeeDao empdao= new EmployeeDaoImp();
		try {
			emp=empdao.readByEmpId(empid);
		} catch (AppException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		boolean result=false;
		String query = "DELETE FROM employee WHERE empid=?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = (PreparedStatement) connection.prepareStatement(query);
		
		preparedStatement.setInt(1, empid);

		int i=preparedStatement.executeUpdate();
		if(i==1) {
			

			System.out.println("Deleting..."+emp );
			result=true;
		}else {
			System.out.println("Id not exist");
		}
		
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
	}

	

}
