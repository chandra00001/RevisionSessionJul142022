package com.glearning.arrays;

public class Line {

	//Point points[];
	public int getData()
	{
		int result = 90;
		return result;
	}
	
	public Point generateSinglePoint()
	{
		Point p = new Point(10,20);
		return p;
	}
	
	public Point[] generatePoints()
	{
		//DECLARATION
		Point points[] = new Point[10];
		
		//ALLOCATION OF MEMORY
		//THRU CONSTRUCTOR 
		/*points[0]= new Point();
		points[1] = new Point();
		--
		--
		points[9] = new Points();*/
		for(int i=0;i<points.length;i++)
		{
			points[i] = new Point(i+10,i+100); // points[0].x points[0].y  points[1] ......points[9]
		}
		
		return points;
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
		int myResult = line.getData();
		System.out.println("Int Value returned by function is "+myResult);
		
		
		Point p1 = line.generateSinglePoint();
		p1.displayPoint();
		
	//	Point p2 = line.generateSinglePoint();
		Point myPoints[] = line.generatePoints();
		/*
		 * myPoints[0]   myPoints[1] myPoints[2].....myPoints[9];
		 * myPoints[0].displayPoints()
		 * myPoints[1].displayPoints()
		 * --
		 * myPoints[9].displayPoints()
		 */
		for(int i=0;i<myPoints.length;i++)
		{
			myPoints[i].displayPoint();
		}
		
		
			
	}

}
