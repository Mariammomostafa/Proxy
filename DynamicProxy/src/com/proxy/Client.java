package com.proxy;

import java.lang.reflect.Proxy;

public class Client {

	public static void main(String[] args) {

		
		ITEmployee itEmployee = new ITEmployee();
		
		itEmployee.setSalary(3000);
		itEmployee.setId(101);
		itEmployee.setName("mrmr");
		
		
		SalaryInvocationHandler invocationHandler = new SalaryInvocationHandler(itEmployee);
		
		Employee employeeProxy =(Employee) Proxy.newProxyInstance(Employee.class.getClassLoader()
				             , new Class[] {Employee.class }
		                     , invocationHandler);
		
		employeeProxy.giveBonus(2000);
		System.out.println(employeeProxy.getSalary());
		System.out.println(employeeProxy.getName());

	}

}
