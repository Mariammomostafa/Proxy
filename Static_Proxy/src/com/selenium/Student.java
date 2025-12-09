 package com.selenium;

public class Student {

	private Attendance attendance;
	

	public void attendLesson() {
		
		System.out.println("Student attend the lesson...");
		
	}
	
	
	
	public Student(Attendance attendance) {
		super();
		this.attendance = attendance;
	}



	public Attendance getAttendance() {
		return attendance;
	}



	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}



	

}
