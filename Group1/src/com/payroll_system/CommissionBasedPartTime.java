package com.payroll_system;

import com.payroll_system.inter.IPrintable;

public class CommissionBasedPartTime extends PartTime {
		

		private int commission;
		
		
		public CommissionBasedPartTime(int commission, int rate, float hours, String name, int age, Vehicle vehicle) {
			super(rate, hours, name, age, vehicle);
			this.commission = commission;
		}
		
		public int getCommission() {
			return commission;
		}

		public void setCommission(int commission) {
			this.commission = commission;
		}
		
		public float commissionCalcEarnings()
		{	
			return ((float)this.getCommission()/100*(this.getHours()*this.getRate()))+(this.getHours()*this.getRate());
		}
		
		public String display()
		{
			IPrintable ip = () -> {return "Name : "+this.getName()+"\nYear of Birth : "+this.calcBirthYear()+"\nEmployee is PartTime / Commissioned"+"\nRate : "+this.getRate()+"\nHours : "+this.getHours()+"\nCommission : "+this.getCommission()+"\n Earnings : "+this.commissionCalcEarnings()+"( "+((float)this.getHours()*this.getRate())+" + "+this.getCommission()+"% of "+((float)this.getHours()*this.getRate())+")";};
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
