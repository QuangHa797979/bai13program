package com.fsoft.defaultstaticexample;

public class MyClass implements FirstInterface, SecondInterface {

	@Override
	public void firstMethod(String string) {	
	}
	
    @Override
    public void secondMethod() {
    }

    @Override
    public void log(String string){
        System.out.println("MyClass logging::" + string);
    }
}

// Java không cho phép đa thừa kế đối với class bởi vì trình biên dịch sẽ không biết chọn phương thức nào của superclass để sử dụng
//  Để chắc chắn rằng, vấn đề này sẽ không xảy ra với interface, class phải implement các phương thức common default.
// Vì thế, nếu class được implements từ cả 2 interface trên, thì nó phải implement phương thức log() để trình biên dịch không ném ra lỗi.