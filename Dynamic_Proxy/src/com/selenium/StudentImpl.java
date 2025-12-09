 package com.selenium;

public class StudentImpl implements Student{

	private int id ;
	private String name ;
	
	private Attendance attendance;
	
	
	
	public StudentImpl() {
		super();
	}

	public StudentImpl(int id, String name, Attendance attendance) {
		this.id = id;
		this.name = name;
		this.attendance = attendance;
	}

	@Override
	public void attendLesson() {
		
		System.out.println("Student attend the lesson...");
		
	}
	
	@Override
	public void studentInfo() {
		
		System.out.println(" Student id : " + getId());
		System.out.println(" Student name : " + getName());
		
	}
	
	



	public Attendance getAttendance() {
		return attendance;
	}



	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentImpl [id=" + id + ", name=" + name + ", attendance=" + attendance + "]";
	}



	



	

}
