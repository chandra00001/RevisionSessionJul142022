package com.greatlearning.arrays;

public class JaggedArraySample {

	int jagArray[][] = new int[3][];
	
	public void populateDisplayJagArray()
	{
		jagArray[0] = new int[3]; // jagArray[0][0]  jagArray[0][1] jagArray[0][2]
		jagArray[1] = new int[4]; // jagArray[1][0]  jagArray[1][1]  jagArray[1][2]  jagArray[1][3]
		jagArray[2] = new int[2]; //// jagArray[2][0]  jagArray[2][1]
		
		
			for(int j=0;j<3;j++)
			{
				jagArray[0][j] = (j+1)* 10;			//10 20 30
				System.out.print(jagArray[0][j]+" ");
			}
			System.out.println();
		
			for(int j=0;j<4;j++)
			{
				jagArray[1][j] = (j+1)*100;  // 100 200 300
				System.out.print(jagArray[1][j]+" ");
				
			}
			System.out.println();
			for(int j=0;j<2;j++)
			{
				jagArray[2][j] = (j+1)*1000; //1000 2000 3000
				System.out.print(jagArray[2][j]+" ");
			}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JaggedArraySample jas = new JaggedArraySample();
		jas.populateDisplayJagArray();

	}

}
