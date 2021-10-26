package com.fsoft.defaultstaticexample;

public interface FirstInterface {

    void firstMethod(String string);

    default void log(String string){
        System.out.println("This method is default implementation" + string);
    }
}

// Phương thức log(String str) chính là phương thức default của FirstInterface

// Khi một class được implements từ FirstInterface nó không bắt buộc phải implement phương thức default

//  Tính năng này sẽ giúp ta mở rộng các phương thức bổ sung phát sinh sau này mà không ảnh hưởng đến các class liên quan, 
//  ta chỉ cần viết thêm các phương thức default trong interface.