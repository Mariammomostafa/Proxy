package com.selenium;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		DailySession student = new StudentProxy(new Attendance(new Date() , false));
		student.attendLesson();
	}

}
