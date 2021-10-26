package com.fsoft.propertiesoopexplain;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private List<Animal> animals = new ArrayList<Animal>();
	
	public void add(Animal animal) {
		animals.add(animal);
	}
	
	public void remove(Animal animal) {
		animals.remove(animal);
	}
	
	public void showListAnimal() {
		for (Animal animal : animals) {
			animal.sayHello();
		}
	}
}

// Lớp Zoo để quản lí nhiều Animal, có các phương thức add, remove để thêm, bớt các Animal (các đối tượng của các lớp thừa kế từ Animal), 
// phương thức showListAnimal để gọi sayHello của tất cả đối tượng nó quản lí. 
// Điều này thể hiện tính đa hình, Zoo khi gọi chỉ gọi một phương thức sayHello, nhưng tùy con vật mà lời chào hỏi sẽ khác nhau.



