package com.fsoft.propertiesoopexplain;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}
	
	@Override
	public void sayHello() {
		System.out.println("I'm " + super.getName());
		
	}
}
