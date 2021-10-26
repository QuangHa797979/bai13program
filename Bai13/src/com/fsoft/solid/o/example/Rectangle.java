package com.fsoft.solid.o.example;

import java.awt.Point;

//public class Rectangle {
//	  public Point topLeft;
//	  public double height;
//	  public double width;
//	}

public class Rectangle implements Shape {
	  private Point topLeft;
	  private double height;
	  private double width;
	  public double area() {
	    return height * width; 
	  }
	}