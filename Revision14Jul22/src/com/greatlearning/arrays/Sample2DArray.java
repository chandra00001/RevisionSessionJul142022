package com.greatlearning.arrays;

import java.util.Scanner;

public class Sample2DArray {
	String studentName[] = new String[5];
	int score[][] = new int[5][3];
	Scanner scan1 = new Scanner(System.in);
	
	
	public void acceptStudentNamesAndScores()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the Student Name");
			studentName[i] = scan1.next();
		}
		System.out.println("Enter 3 scores for 5 Students");
		
		for(int i=0;i<5;i++)				// 0 [0][1][2]
		{								// 1 [0][1][2]
			System.out.println("Enter Student "+(i+1)+" Score ");
			for(int j=0;j<3;j++)			// 2 [0][1][2]
			{
				System.out.println("Enter Subject"+(j+1)+" Score");
				score[i][j]=scan1.nextInt();
			}
		}
		
	}
	public void displayStudentScoreDetails()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(" The Student "+studentName[i]);
			
			System.out.println("The scores of this Student ");
			for(int j=0;j<3;j++)
			{
				System.out.println("Subject "+(j+1)+" : "+score[i][j]);
				
			}
			System.out.println("-----------------");
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample2DArray sda = new Sample2DArray();
		sda.acceptStudentNamesAndScores();
		sda.displayStudentScoreDetails();

	}

}
