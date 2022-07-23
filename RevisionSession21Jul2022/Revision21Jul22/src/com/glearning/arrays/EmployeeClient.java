package com.glearning.arrays;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int num[] = new int[3] primitive
		//Declare an Array of Employee type Objects of size 3
		Employee employees[] = new Employee[3];
		
		//Memory allocation for each of the Object stored in array
	/*	employees[0] = new Employee();
		employees[1] = new Employee();
		employees[2] = new Employee();*/
		
		for(int i=0;i<3;i++)
		{
			employees[i] = new Employee();
		}
		
		employees[0].acceptEmployee("E001", "Suresh");
		employees[0].displayEmployee();
		
		employees[1].acceptEmployee("E002", "Sumesh");
		employees[1].displayEmployee();
		
		employees[2].acceptEmployee("E003", "Suman");
		employees[2].displayEmployee();/**/
		
		Employee e1 = new Employee();
		e1.acceptEmployee("E001", "Suresh");
		e1.displayEmployee();
		

	}

}
