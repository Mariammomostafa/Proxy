package com.proxy;

public class ITEmployee implements Employee {

	private int id ;
	private String name ;
	private double salary ;
	
	@Override
	public void giveBonus(double amount) {
		
		//this.salary = this.salary + amount;

		this.setSalary(this.getSalary() + amount);
		
	}

	@Override
	public void payCut(double amount) {
		
		//this.salary = this.salary - amount;
		this.setSalary(this.getSalary() - amount);
		
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public void setId(int id) {
		
		this.id =id;
		
	}

	@Override
	public int getId() {
		
		return this.id;
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public String getName() {
		
		return this.name;
	}

}
