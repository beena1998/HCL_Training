package main;

import java.util.Scanner;

import service.checkCharacters;

public class UserMainCode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scan.nextLine();

checkCharacters characters= new checkCharacters();
int valid=checkCharacters.validOrNot(str);
if(valid==1) {
	System.out.println("Valid");
}
else {
	System.out.println("Not valid");
}
		scan.close();
	}

}
