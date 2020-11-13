package main;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

import service.EmployeeNameDesignation;

public class EmplyeeNameDesignationMain {

	public static void main(String[] args) {

		System.out.println("Enter the number of employees you eant ot enter : ");
		Scanner scan = new Scanner(System.in);
		int noEmployee = scan.nextInt();

		LinkedHashMap<String, String> employeeDetail = new LinkedHashMap<String, String>();
		for (int i = 0; i < noEmployee; i++) {
			String name = scan.nextLine();
			String designation = scan.nextLine();
			employeeDetail.put(name, designation);
		}

		String searchDesignation = scan.nextLine();
		LinkedHashMap<String, String> findEemployeeDesignation = new LinkedHashMap<String, String>();
		EmployeeNameDesignation employeeNameDesignation= new EmployeeNameDesignation();
		findEemployeeDesignation = EmployeeNameDesignation.findEmployee(employeeDetail, searchDesignation);
		Iterator<String> it = findEemployeeDesignation.keySet().iterator();

		while (it.hasNext()) {
			String s2 = it.next();
			System.out.println(s2);

		}
		scan.close();
		employeeNameDesignation=null;
	}

}
