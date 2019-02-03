package com.payroll_system;

import java.util.ArrayList;
import java.util.List;

import com.payroll_system.abstracts.Employee;

public class SingleToneExample {
			
	
			static SingleToneExample obj = null;
			List<Employee> ee;
			private SingleToneExample()
			{
				 ee = new ArrayList<>();
			}
			public static SingleToneExample getObj()
			{
				if(obj == null)
				{
					obj = new SingleToneExample();
				
				}
				return obj;
			}
			public void addIntoList(Employee temp)
			{
				ee.add(temp);
				
			}
			public void  displayList()
			{
				for(Employee e : this.ee)
				{
					System.out.print(e.printData());
					System.out.print("\n");
				}
			}
			
			
			
}
