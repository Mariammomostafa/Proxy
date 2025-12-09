package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SalaryInvocationHandler implements InvocationHandler{

	private Object  target;
	
	public SalaryInvocationHandler(Object target) {
		this.target = target;	
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		// pre - proccessing
		if(method.getName().equals("giveBonus")) {
			
			 double amount= (double)args[0];
			 if(amount <=0) {
				 
				 throw new RuntimeException(" amount is NOT valid");
			 }
		}
		
		// call method of actual code
		Object result = method.invoke(target, args); // employee.giveBonus(2000);
		
		// post - proccessing
		System.out.println("Executing method : " + method.getName() + " & return type is : "+method.getReturnType());
		
		return result;
	}
	
	
	
	

}
