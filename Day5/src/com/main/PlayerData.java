package com.main;

import java.util.Scanner;

import com.service.ValidateAge;

import appexception.CustomException;
import model.Player;

public class PlayerData {

	public static void main(String[] args) throws CustomException {
		Scanner scan = null;
		ValidateAge validateAge = null;
		try {
			scan = new Scanner(System.in);
			System.out.println("Enter Player name: ");
			String name = scan.next();
			System.out.println("Enter Player age: ");
			int age = scan.nextInt();
			Player player = new Player();
			player.setName(name);
			player.setAge(age);

			validateAge = new ValidateAge();
			int res = validateAge.checkAge(age);
			if (res == 1) {
System.out.println("Player Name: "+player.getName());
System.out.println("Player Age: "+player.getAge());
			} else {
				throw new CustomException("Not valid age!!");
			}

		} catch (CustomException ce) {
			System.err.println(ce.getMessage());
		} finally {
			scan.close();
			validateAge = null;
		}
	}

}
