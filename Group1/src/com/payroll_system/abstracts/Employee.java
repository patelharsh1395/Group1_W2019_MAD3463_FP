package com.payroll_system.abstracts;

import java.util.Calendar;

import com.payroll_system.enums.gender;
import com.payroll_system.inter.IPrintable;

public abstract class Employee implements IPrintable {
	private String Name;
	private int age;	
	private gender gen;
	
	private Vehicle vehicle;
	
	
	
	public Employee()
	{
		
	}
	
	public Employee(String name, int age,gender gen, Vehicle vehicle) {
		super();
		Name = name;
		this.age = age;
		this.vehicle= vehicle;
		this.gen= gen;
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
	public gender getGen() {
		return gen;
	}

	public void setGen(gender gen) {
		this.gen = gen;
	}

			
}
