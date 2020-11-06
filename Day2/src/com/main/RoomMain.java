package com.main;

import java.util.Scanner;

import com.service.Room;

public class RoomMain {

	public static void main(String[] args) {
		

		System.out.println("Enter room no.");
		Scanner scan = new Scanner(System.in);
		int roomno = scan.nextInt();
		System.out.println("Enter room type:");
//		System.out.println("Heelloo");
		String roomtype = scan.next();
		System.out.println("Enter room area.");
		String roomarea = scan.next();
		System.out.println("Enter AC machine");
		int ac = scan.nextInt();
		Room room=new Room(roomno,roomtype, roomarea, ac);
		room.display(roomno,roomtype,roomarea,ac);
		
		scan.close();
		room=null;
	}

}
