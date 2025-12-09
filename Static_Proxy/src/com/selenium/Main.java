package com.selenium;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		Student student = new StudentProxy(new Attendance(new Date() , true));
		student.attendLesson();
	}

}
