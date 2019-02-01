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
	
	public String display()
	{	
		IPrintable ip = () -> {return "Name : "+this.getName()+"\nYear of Birth : "+this.calcBirthYear()+"\nEmployee is Full time"+"\nBonus : "+this.getBonus()+"\nSalary : "+this.getSalary()+"\nEarnings : "+ this.calcEarning();};
		String temp="";
		if(this.getVehicle() != null)
		{
			if(this.getVehicle() instanceof Car )
			{
				temp = "\nEmployee has Car"+"\nMake : "+this.getVehicle().getMake()+"\nPlate : "+this.getVehicle().getPlate()+"\nMileage : "+this.getVehicle().getMileage()+"\n Model no : "+((Car)this.getVehicle()).getCarmodelnumber();
				
			}
			else
			{
				temp = "\nEmployee has motorcycle"+"\nMake : "+this.getVehicle().getMake()+"\nPlate : "+this.getVehicle().getPlate()+"\nMileage : "+this.getVehicle().getMileage()+"\n Model no : "+((MotorCycle)this.getVehicle()).getMotomodelnumber();
				
			}
		}
		else
		{
			temp = "Employee dont have vehicle";
		}
		return ip.printData()+temp;
		
		
	}
	
	
}
