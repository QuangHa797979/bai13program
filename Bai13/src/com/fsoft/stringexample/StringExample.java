package com.fsoft.stringexample;

public class StringExample {
	public static void main(String[] args) {

	String s1 = "Hello";
	String s2 = "Hello"; 
	String s3 = s1;  
	String s4 = new String("Hello");  
	String s5 = new String("Hello");
	if(s1 == s1) {
		System.out.println("true");
	}
	if(s1 == s2) {
	System.out.println("true");
}
	if(s1 == s3) {
	System.out.println("true");
}
	if(s1 == s4) {
	System.out.println("false");
}
	if(s1 == s5) {
	System.out.println("false");
}
	
	if(s1.equals(s3)) {
		System.out.println("true");
	}
	
	if(s1.equals(s4)) {
		System.out.println("true");
	}
	
	if(s1.equals(s5)) {
		System.out.println("true");
	}	
}
}

// String là không thể thay đổi (immutable), 
// và không cho phép có class con.

// Các đối tượng String được lưu trữ trên Heap, 
// yêu cầu quản lý bộ nhớ phức tạp và tốn không gian lưu trữ. 
// Hai đối tượng String có nội dung giống nhau lưu trữ trên 2 vùng bộ nhớ khác nhau của Heap.

