package com.payroll_system;

import com.payroll_system.abstracts.Employee;
import com.payroll_system.abstracts.Vehicle;
import com.payroll_system.enums.gender;
import com.payroll_system.inter.IPrintable;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

public class Intern extends Employee  {
		private String schoolname;

		public Intern() {
			super();
		}
		
		
		 
		public Intern(String schoolname,String name, int age , gender gen , Vehicle vehicle ) {
			super(name,age, gen , vehicle);
			this.schoolname = schoolname;
		}

		public String getSchoolname() {
			return schoolname;
		}

		public void setSchoolname(String schoolname) {
			this.schoolname = schoolname;
		} 
		
		
		


		@Override
		public String printData() {
			String temp = "Name : "+this.getName()+"\nYear of Birth : "+this.calcBirthYear()+"\nGender : "+this.getGen()+"\nEmployee is Intern"+"\nSchool name : "+ this.getSchoolname()+"\nEarnings : "+ this.calcEarning();
			if(this.getVehicle() != null)
			{
				if(this.getVehicle() instanceof Car )
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
				temp+="\nEmployee dont have vehicle";
			}
			
			
			return temp;
		}
		
		
		
		
		
}
