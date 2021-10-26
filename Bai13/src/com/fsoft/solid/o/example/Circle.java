package com.fsoft.solid.o.example;

import java.awt.Point;

//public class Circle {
//	  public Point center;
//	  public double radius;
//	}

public class Circle implements Shape {
	  private Point center;
	  private double radius;
	  public final double PI = 3.141592653589793;
	  public double area() {
	    return PI * radius * radius;
	  }
	}