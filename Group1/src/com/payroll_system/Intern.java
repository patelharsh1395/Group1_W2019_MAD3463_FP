package com.payroll_system;

import com.payroll_system.inter.IPrintable;

public class Intern extends Employee  {
		private String schoolname;

		public Intern() {
			super();
		}
		
		
		 
		public Intern(String schoolname,String name, int age , Vehicle vehicle ) {
			super(name,age, vehicle);
			this.schoolname = schoolname;
		}

		public String getSchoolname() {
			return schoolname;
		}

		public void setSchoolname(String schoolname) {
			this.schoolname = schoolname;
		} 
		
		
		public String display()
		{
			IPrintable ip = () -> {return "Name : "+this.getName()+"\nYear of Birth : "+this.calcBirthYear()+"\nEmployee is Intern"+"\nSchool name : "+ this.getSchoolname()+"\nEarnings : "+ this.calcEarning();};
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
