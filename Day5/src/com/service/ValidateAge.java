package com.service;

import appexception.CustomException;

public class ValidateAge {
	
	public int checkAge(int age ) throws CustomException {
		int i=0;
		if(age>=19) {
			i=1;
		}
		else {
			
			 i=0;
		}
		return i;
	}

}
