package com.glearning.arrays;

public class Point {
	
	int x,y;

	
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void displayPoint()
	{
		System.out.println("X Coord is :"+x+" Y Coordinate is :"+y);
	}

}

// Point p = new Point(); p.displayPoint() 0,0
// Point p = new Point(10,20); p.displayPoint();