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
			System.out.println("Enter name of employee "+i+1);
			String name = scan.next();
			
			System.out.println("Enterdesignation of employee "+i+1);
			String designation = scan.next();
			employeeDetail.put(name, designation);
		}
		System.out.println("Enter the designation you want to search : ");
		String searchDesignation = scan.next();
		LinkedHashMap<String, String> findEemployeeDesignation = new LinkedHashMap<String, String>();
		EmployeeNameDesignation employeeNameDesignation= new EmployeeNameDesignation();
		findEemployeeDesignation = employeeNameDesignation.findEmployee(employeeDetail, searchDesignation);
		Iterator<String> it = findEemployeeDesignation.keySet().iterator();

		while (it.hasNext()) {
			String s2 = it.next();
			System.out.println("HI");
			System.out.println(s2);

		}
		scan.close();
		employeeNameDesignation=null;
	}

}
