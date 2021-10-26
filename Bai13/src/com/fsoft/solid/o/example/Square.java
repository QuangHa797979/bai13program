package com.fsoft.solid.o.example;

import java.awt.Point;

//public class Square {
//	  public Point topLeft;
//	  public double side;
//	}


	public class Square implements Shape {
	  private Point topLeft;
	  private double side;
	  public double area() {
	  return side*side;
	  }
	}
