package com.proxy;

public interface Employee {
	
	public void giveBonus(double amount);
	
	public void payCut(double amount);

	void setId(int id);

	int getId();

	void setName(String name);

	String getName();
	
	public void setSalary(double salary);

	public double getSalary();

}
