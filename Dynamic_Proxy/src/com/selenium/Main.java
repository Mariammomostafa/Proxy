package com.selenium;

import java.lang.reflect.Proxy;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		
		
		Student student = new StudentImpl(102, "ganna", new Attendance(new Date() , true));

		StudentInvocationHandler invocationHandler = new StudentInvocationHandler(student);
		
		Student proxyInstance =(Student) Proxy.newProxyInstance(Student.class.getClassLoader()
								, new Class[] {Student.class}
						        , invocationHandler);
		
		proxyInstance.attendLesson();
		
		proxyInstance.studentInfo();
	}

}
