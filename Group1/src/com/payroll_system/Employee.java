package com.payroll_system;

import java.util.Calendar;

import com.payroll_system.inter.IPrintable;

public abstract class Employee implements IPrintable {
	private String Name;
	private int age;	
	private Vehicle vehicle;
	
	
	
	public Employee()
	{
		
	}
	
	public Employee(String name, int age,Vehicle vehicle) {
		super();
		Name = name;
		this.age = age;
		this.vehicle= vehicle;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
			
	public int calcBirthYear()
	{
		return (Calendar.getInstance().get(Calendar.YEAR)-age);
	}
	
	public int calcEarning()
	{
		return 1000;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

			
}
