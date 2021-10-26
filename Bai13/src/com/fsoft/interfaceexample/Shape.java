package com.fsoft.interfaceexample;

public interface Shape {
    
    String color = "red";
     
    void draw();
     
}

// Interface là một kỹ thuật để thu được tính trừu tượng hoàn toàn và đa kế thừa trong Java.
// Interface luôn luôn có modifier là: public interface, cho dù có khai báo rõ hay không.
// Không thể khởi tạo một interface.
// Một interface không chứa bất cứ hàm Contructor nào.
// Tất cả các phương thức của interface đều là abstract.
// Một interface không thể chứa một trường nào trừ các trường vừa static và final.
// Một interface không thể kế thừa từ lớp, nó được triển khai bởi một lớp.
// Một interface có thể kế thừa từ nhiều interface khác.

// Một lớp có thể triển khai một hoặc nhiều interface tại một thời điểm.
// Một lớp chỉ có thể kế thừa một lớp khác, nhưng được triển khai nhiều interface.
// Một interface có thể kế thừa từ một interface khác, tương tự cách một lớp có thể kế thừa lớp khác.

