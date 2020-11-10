package com.main;

import java.util.Scanner;

import com.appexception.UserException;
import com.model.User;
import com.service.UserService;
import com.service.UserServiceImpl;

public class LoginAppl {

	public static void main(String[] args) {
		UserService userService = new UserServiceImpl();
		int id;
		Scanner scan = new Scanner(System.in);
		id = scan.nextInt();
		try {
			User obj = userService.readByUser(id);

			if (obj != null) {
				System.out.println(obj.getUserId());
				System.out.println(obj.getUserName());
				System.out.println(obj.getPassword());
			}
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}

	}

}
