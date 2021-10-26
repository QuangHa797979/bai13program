package com.fsoft.defaultstaticexample;

public class ThirdImpl implements ThirdInterface {

    public boolean isNull(String string) {
        System.out.println("Impl Null Check");

        return string == null ? true : false;
    }

    public static void main(String args[]){
        ThirdImpl obj = new ThirdImpl();
        obj.print("");
        obj.isNull("abc");
    }
}

// Phương thức isNull(String string) là một phương thức đơn giản, nó không override phương thức của interface. 
// Ví dụ nếu chúng ta thêm annotation @Override cho phương thức isNull(), trình biên dịch sẽ báo lỗi. 

// Phương thức static chỉ hiển thị trong phương thức của interface, nếu ta xóa phương thức isNull() trong class ThirdImpl, chúng ta sẽ không thể sử dụng nó cho object của ThirdImpl. 
// Tuy nhiên, giống như các phương thức static khác, chúng ta có thể sử dụng phương thức static của interface thông qua tên của class