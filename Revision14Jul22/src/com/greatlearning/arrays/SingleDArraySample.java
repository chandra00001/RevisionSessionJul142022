package com.greatlearning.arrays;

import java.util.Scanner;

public class SingleDArraySample {

	int scores[] = new int[10];
	Scanner scan1 = new Scanner(System.in);
	
	public void populateArray()
	{
		//for(int i=0;i<10;i++)
		for(int i=0;i<scores.length;i++)
		{
			System.out.println("Enter the Score of Student "+(i+1));// 87 90 82 ...
			scores[i] = scan1.nextInt();
		}
	}
	public void displayArray()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("The Score of the Student "+(i+1)+" is "+scores[i]);
		}
	}
	public void findAverageScore() // CAMEL CASE FOR FUNCTIONS,OBJECTS AND VARIABLES 
	{
		
		int total=0;
		double averageScore;
		
		for(int i=0;i<10;i++)
		{
			total = total + scores[i];
		}
		System.out.println("The Total Score is "+total);
		int scoreSize = scores.length;
		averageScore = total / scoreSize ;
		System.out.println("The average is "+averageScore);
		
	}
	// The score of the Student 1 is 87
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDArraySample sars = new SingleDArraySample();
		
		sars.populateArray();
		sars.displayArray();
		sars.findAverageScore();

	}

}
