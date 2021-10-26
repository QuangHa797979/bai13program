package com.fsoft.propertiesoopexplain;

public abstract class Animal {

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public abstract void sayHello();

	public String getName() {
		return name;
	}
}

// Abstract class Animal có phương thức sayHello. 
// abstract class này thể hiện tính trừu tượng, 
// có nghĩa là con vật gì đi nữa thì nó cũng có phương thức sayHello.
