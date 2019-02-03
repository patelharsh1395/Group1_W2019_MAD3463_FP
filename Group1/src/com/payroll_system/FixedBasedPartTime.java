package com.payroll_system;

import com.payroll_system.abstracts.PartTime;
import com.payroll_system.abstracts.Vehicle;
import com.payroll_system.enums.gender;
import com.payroll_system.inter.IPrintable;

public class FixedBasedPartTime  extends PartTime {
		private int fixedamount;

		public FixedBasedPartTime(int fixedamount,int rate, float hours , String name, int age, gender gen ,Vehicle vehicle) {
			super( rate,  hours ,  name,  age, gen , vehicle);
			this.fixedamount = fixedamount;
		}

		public int getFixedamount() {
			return fixedamount;
		}

		public void setFixedamount(int fixedamount) {
			this.fixedamount = fixedamount;
		}
		
		public float fixedAmountCalcEarnings()
		{
			return this.getFixedamount()+((float)this.getHours()*this.getRate());
		}
		
		

		@Override
		public String printData() {
			String temp = "Name : "+this.getName()+"\nYear of Birth : "+this.calcBirthYear()+"\nGender : "+this.getGen()+"\nEmployee is PartTime / Commissioned"+"\nRate : "+this.getRate()+"\nHours : "+this.getHours()+"\nFixed amount : "+this.getFixedamount()+"\n Earnings : "+this.fixedAmountCalcEarnings()+"( "+((float)this.getHours()*this.getRate())+" + "+this.getFixedamount()+")";
			
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
