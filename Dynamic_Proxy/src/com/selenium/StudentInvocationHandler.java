package com.selenium;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StudentInvocationHandler implements InvocationHandler{

	private Object target;
		
	public StudentInvocationHandler(Student target) {
		this.target = target;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("Method name is : " +method.getName() + " , return type is : " + method.getReturnType());
		
		if(method.getName().equals("attendLesson")) {
			
			if(((Student) target).getAttendance().isPresent() != true) {
				
				throw new RuntimeException("Student is absence ...");
				
			}
		}
		Object returnValue = method.invoke(target, args);
		return returnValue;	}

}
