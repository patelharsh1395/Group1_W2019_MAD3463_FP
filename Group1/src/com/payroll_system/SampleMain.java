package com.payroll_system;

public class SampleMain {

	public static void main(String[] args) {
		//System.out.println("Hello world");
		
		//Employee e1 = new Employee("Mahesh", 20);
		
		//System.out.println(e1.calcBirthYear());
		
		Intern in = new Intern("Lambton","Mahesh", 20, null);
		System.out.println(in.display());
		
		System.out.println("\n");
		
		FullTime ft = new FullTime(10000, 500,"Raju", 30,new MotorCycle("Audi","A4" , "CA123", 15));
		System.out.println(ft.display());
		
		System.out.println("\n");
		CommissionBasedPartTime cm = new CommissionBasedPartTime(10, 5, 5, "Gurminder", 27,new MotorCycle("Audi","A4" , "CA123", 15) );
		System.out.println(cm.display());
		
		System.out.println("\n");
		FixedBasedPartTime fp = new FixedBasedPartTime(1000, 5, 5,"Gurminder", 27,new MotorCycle("Audi","A4" , "CA123", 15) );
				System.out.println(fp.display());
	}

}
