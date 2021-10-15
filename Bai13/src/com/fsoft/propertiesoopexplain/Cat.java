package com.fsoft.propertiesoopexplain;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	

	@Override
	public void sayHello() {
		System.out.println("I'm " + super.getName());
		
	}
}

// 2 lớp Cat và Dog kế thừa từ Animal. 
// Khi khởi tạo chúng sẽ có tên. 
// Chúng override lại phương thức sayHello để chào hỏi theo cách riêng của chúng. 
// Điều này thể hiện tính đóng gói (đóng gói biến tên và phương thức sayHello với nhau) 
// và tính thừa kế (Cat và Dog mang đặc điểm chung là có sayHello từ Animal).