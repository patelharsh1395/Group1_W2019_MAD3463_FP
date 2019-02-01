package com.payroll_system;

public class PartTime extends Employee {
		private int rate;
		private float hours;
		
		
		
		public PartTime(int rate, float hours , String name, int age,Vehicle vehicle) {
			super(name, age, vehicle);
			this.rate = rate;
			this.hours = hours;
		}
		public int getRate() {
			return rate;
		}
		public void setRate(int rate) {
			this.rate = rate;
		}
		public float getHours() {
			return hours;
		}
		public void setHours(float hours) {
			this.hours = hours;
		}
		
}
