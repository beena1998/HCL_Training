package service;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class EmployeeNameDesignation {
	public static LinkedHashMap<String, String> findEmployee(LinkedHashMap<String, String> h1, String n) {
	
		LinkedHashMap<String, String> employeeDetail = new LinkedHashMap<String, String>();
		Iterator<String> it = h1.keySet().iterator();
		while (it.hasNext()) {
			String s2 = it.next();
			String s3 = h1.get(s2);
			if (s3.equals(n))
				employeeDetail.put(s2, s3);
		}
		return employeeDetail;
	}

}
