package com.service;

public class Room {
	private int roomno;
	private String roomtype;
	private String roomarea;
	private int ACmachine;

	
	
	public Room(int roomno, String roomtype, String roomarea, int aCmachine) {
		super();
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.roomarea = roomarea;
		ACmachine = aCmachine;
	}



	public int getRoomno() {
		return roomno;
	}



	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}



	public String getRoomtype() {
		return roomtype;
	}



	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}



	public String getRoomarea() {
		return roomarea;
	}



	public void setRoomarea(String roomarea) {
		this.roomarea = roomarea;
	}



	public int getACmachine() {
		return ACmachine;
	}



	public void setACmachine(int aCmachine) {
		ACmachine = aCmachine;
	}



	public void display(int roomno, String roomtype2,String roomarea2, int ACmachine) {
		System.out.println("Room Number :"+getRoomno());
		System.out.println("Room Type   :"+getRoomtype());
		System.out.println("Room Number :"+getRoomarea());
		System.out.println("AC Machine  :"+getACmachine());
	}
}
