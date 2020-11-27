package com.main;

import java.util.Scanner;

import com.appexception.AppException;
import com.model.Employee;

import com.service.EmployeeService;
import com.service.EmployeeServiceImp;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you choice:");
		System.out.println("1.Create Employee record \n2.Read Employee details"
				+ "\n3.Update Employee detail\n4.Delete Employee record");
		int choice = scan.nextInt();
		Employee employee = new Employee();
		EmployeeService employeeService = new EmployeeServiceImp();

		switch (choice) {
		case 1:

			System.out.print("Enter Employee ID :");
			int empId = scan.nextInt();
			employee.setEmpid(empId);

			System.out.print("Enter Employee Name :");
			String empName = scan.next();
			employee.setEmpname(empName);
			System.out.print("Enter Employee Salary :");
			float salary = scan.nextFloat();
			employee.setSalary(salary);

			try {
				employee = employeeService.createEmployee(employee);
				System.out.println("Welcome : " + employee.getEmpname());
			} catch (AppException e) {

				e.printStackTrace();
			}

			break;

		case 2:

			System.out.println("Enter your choice :\n1) Read By Employee ID:\n2) Read By Employee Name : ");
			int ch = scan.nextInt();
			switch (ch) {

			case 1:

				System.out.print("Enter Employee ID : ");
				int empid = scan.nextInt();
				try {
					employee = employeeService.readByEmpId(empid);
					System.out.println("Welcome : " + employee.getEmpname());
				} catch (AppException e) {

					e.printStackTrace();
				}

				break;

			case 2:

				System.out.print("Enter Employee Name : ");
				String empname = scan.next();
				try {
					employee = employeeService.readByEmpName(empname);
					System.out.println("Welcome : " + employee.getEmpname());
				} catch (AppException e) {

					e.printStackTrace();
				}
				break;

			default:

				System.out.println("Invalid input. Please try again!!");
				break;
			}

			break;

		case 3:

			System.out.println("What you want to update??\nEnter your choice: ");
			System.out.println("1)Update Employee Name\n2)Update Employee ID\n3)Update Salary");
			int ch2 = scan.nextInt();

			switch (ch2) {
			case 1:
				System.out.println("Enter employee ID for searching employee :");
				int empid = scan.nextInt();
				System.out.println("Enter new name you want : ");
				String empname = scan.next();
				employee.setEmpid(empid);
				employee.setEmpname(empname);
				try {
					employee = employeeService.updateEmployeeName(employee);
					System.out.println(employee);

				} catch (AppException e) {

					e.printStackTrace();
				}

				break;
			case 2:
				System.out.println("Enter employee name for searching employee :");
				String empname2 = scan.next();
				System.out.println("Enter new employee ID you want : ");
				int empid2 = scan.nextInt();

				employee.setEmpid(empid2);
				employee.setEmpname(empname2);
				try {
					employee = employeeService.updateEmployeeId(employee);
					System.out.println(employee);

				} catch (AppException e) {

					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Enter employee ID for searching employee :");
				int empid3 = scan.nextInt();
				System.out.println("Enter new SALARY you want : ");
				float salary2 = scan.nextFloat();

				employee.setEmpid(empid3);
				employee.setSalary(salary2);

				try {
					employee = employeeService.updateEmployeeSalary(employee);
					System.out.println(employee);

				} catch (AppException e) {

					e.printStackTrace();
				}

				break;

			default:
				System.out.println("Enter Valid input!!");
				break;
			}

			break;

		case 4:
			System.out.println("Enter Employee ID which you want to delete.");
			int empid = scan.nextInt();
			boolean result = employeeService.deleteEmpById(empid);
			if (result) {
				System.out.println("Record deleted!!");
			}
			break;
		default:
			System.out.println("Wait!!");
			break;
		}
		scan.close();
	}

}
