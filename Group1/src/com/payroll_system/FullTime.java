package com.payroll_system;

import com.payroll_system.inter.IPrintable;

public class FullTime extends Employee {
	private int salary;
	private int bonus;
	
	
	
	
	public FullTime(int salary, int bonus,String name, int age, Vehicle vehicle) {
		super(name,age,vehicle);
		this.salary = salary;
		this.bonus = bonus;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}




	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public int calcEarning() {
		
		return this.getSalary()+this.getBonus();
	}
	
	

	@Override
	public String printData() {
		String temp ="Name : "+this.getName()+"\nYear of Birth : "+this.calcBirthYear()+"\nEmployee is Full time"+"\nBonus : "+this.getBonus()+"\nSalary : "+this.getSalary()+"\nEarnings : "+ this.calcEarning();
		if(this.getVehicle() != null)
		{
			if(this.getVehicle() instanceof Car)
			{
				temp+= ((Car)this.getVehicle()).printData();
				
			}
			else
			{
				temp+= ((MotorCycle)this.getVehicle()).printData();
				
			}
		}
		else
		{
			temp += "\nEmployee dont have vehicle";
		}
		
		
		return temp;
	}
	
	
}
