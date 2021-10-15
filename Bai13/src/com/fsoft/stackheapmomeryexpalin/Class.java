package com.fsoft.stackheapmomeryexpalin;

public class Class {
	int i ;
	int y ;
	

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public Class(int i, int y) {
		nhan();
	}

	private int nhan() {
		return i * y;
		
	}
}
