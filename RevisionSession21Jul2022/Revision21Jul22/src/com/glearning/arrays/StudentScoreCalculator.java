package com.glearning.arrays;

public class StudentScoreCalculator {
	
	public void calculateSumAndAverage(String sName,String sAddress,int... scores)
	{
		double average=0.0;
		int sum=0;
		for(int i=0; i<scores.length;i++)
		{
			sum = sum+scores[i];
		}
		int size = scores.length;
		//average = sum / scores.length;
		average = sum / size;
		System.out.println("Student Details are ");
		System.out.println("Student Name "+sName);
		System.out.println("Studend Address "+sAddress);
		System.out.println("The Scores are ");
		for(int i=0;i<scores.length;i++)
		{
			System.out.print(": "+scores[i]);
		}
		System.out.println();
		System.out.println("The Sum of your scores is "+sum);
		System.out.println("The Average of your scores is "+average);
		System.out.println("------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentScoreCalculator ssc = new StudentScoreCalculator();
		ssc.calculateSumAndAverage("Harsha", "RTNagar", 89,90,78,87);
		ssc.calculateSumAndAverage("Harsha", "RTNagar", 89,90,78,87,90);
		ssc.calculateSumAndAverage("Harsha", "RTNagar", 89,90,78);

	}

}
