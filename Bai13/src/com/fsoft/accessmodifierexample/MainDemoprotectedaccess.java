package com.fsoft.accessmodifierexample;

public class MainDemoprotectedaccess {

	public static void main(String[] args) {
		Demoprotectedaccess2 demopublicaccess = new Demoprotectedaccess2();
		demopublicaccess.display();
    }
}

// Output: 25 
// protected access modifier được sử dụng trong quan hệ thừa kế từ Demopublicaccess1 sang Demopublicaccess2, 
// các thành phần protected của class cha được chỉ định 
// cho các class con của nó có thể sử dụng. 
// Ngoài ra các thành phần protected cũng có thể được truy cập từ trong nội bộ class, các class cùng package.