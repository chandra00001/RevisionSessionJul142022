package com.glearning.arrays;

public class Employee {
	
	String empId;
	String empName;
	//Constructors are function which
	// will have same name as that fo the class name
	// which initializes the variables and memory for the Objects
	public void acceptEmployee(String empId,String empName)
	{
		this.empId = empId;
		this.empName = empName;
	}
	public void displayEmployee()
	{
		System.out.println("Employee Id "+empId);
		System.out.println("Employee Name "+empName);
	}
	//Employee e1,e2
	//Employee e1 = new Employee();

}
