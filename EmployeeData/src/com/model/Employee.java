package com.model;

public class Employee {
	private int empid;
	private String empname;
	private float salary;

	public Employee() {
		super();

	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
//		System.out.println("In it!!");
		this.empid = empid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	

}
