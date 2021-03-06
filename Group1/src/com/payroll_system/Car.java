package com.payroll_system;

import com.payroll_system.abstracts.Vehicle;
import com.payroll_system.inter.IPrintable;

public class Car extends Vehicle {
			private String carmodelnumber;
			
			

			public Car(String carmodelnumber,String make, String plate, int mileage) {
				super(make, plate, mileage);
				this.carmodelnumber = carmodelnumber;
			}

			public String getCarmodelnumber() {
				return carmodelnumber;
			}

			public void setCarmodelnumber(String carmodelnumber) {
				this.carmodelnumber = carmodelnumber;
			}
			
			@Override
			public String printData() {
				
				return "\nEmployee has Car"+"\nMake : "+this.getMake()+"\nPlate : "+this.getPlate()+"\nCar Model : "+this.getCarmodelnumber()+"\n";
			}
			
}
