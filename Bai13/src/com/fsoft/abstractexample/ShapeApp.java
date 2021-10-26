package com.fsoft.abstractexample;

public class ShapeApp {
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        rect.draw();
        System.out.println("---");
        Shape circle = new Circle();
        circle.draw();      
    }
}

// Tính trừu tượng trong Java là tính chất không thể hiện cụ thể mà chỉ nêu tên vấn đề. 
// Đó là một quá trình che giấu các hoạt động bên trong và chỉ hiển thị những tính năng thiết yếu của đối tượng tới người dùng.


// Ví dụ: một người sử dụng điện thoại để gửi tin nhắn thì anh ta sẽ nhập nội dung tin nhắn, thông tin người nhận và ấn nút gửi. 
// Khi anh ta bắt đầu gửi tin thì anh ấy không biết những gì diễn ra bên trong quá trình gửi mà chỉ biết được là kết quả của tin nhắn đã được gửi đến người nhận thành công hay chưa. Vì vậy trong ví dụ này, quá trình gửi tin nhắn đã được ẩn đi và chỉ hiển thị những chức năng mà người dùng cần đó là chức năng nhập nội dung tin nhắn, thông tin người nhận, kết quả gửi tin nhắn thành công hay thất bại. 
// Đó chính là tính trừu tượng.

// Ưu điểm khi sử dụng tính trừu tượng để lập trình:

// Tính trừu tượng cho phép các lập trình viên loại bỏ tính chất phức tạp của đối tượng bằng cách chỉ đưa ra các thuộc tính và phương thức cần thiết của đối tượng trong lập trình, 
// cải thiện khả năng bảo trì của hệ thống.
// Tính trừu tượng giúp chúng ta tập trung vào những cốt lõi cần thiết của đối tượng thay vì quan tâm đến cách nó thực hiện.
// Tính trừu tượng cung cấp nhiều tính năng mở rộng khi sử dụng kết hợp với tính đa hình và kế thừa trong lập trình hướng đối tượng.

// Java trừu tượng hóa thông qua các lớp trừu tượng (Abstract class) và các giao diện (Interface)

// [access_modifier] abstract [kiểu_trả_về] [tên_phương_thức_trừu_tượng] [<đối_số_truyền_vào>];

// Một lớp được khai báo với từ khóa abstract là lớp trừu tượng (abstract class).

// Lớp trừu tượng có thể có các phương thức abstract hoặc non-abstract.

// Lớp trừu tượng có thể khai báo nhiều method trừu tượng bên trong.

// Không thể khởi tạo 1 đối tượng trực tiếp từ một lớp trừu tượng.

// Một lớp kế thừa từ lớp trừu tượng (subclass – lớp con) không cần phải implement non-abstract methods, 
// những phương thức abstract trong lớp cha thì lớp con bắt buộc phải override. Trừ khi subclass cũng là abstract.

// Lớp con bắt buộc phải cài đặt (implement) tất cả các phương thức trừu tượng của lớp cha

// Không thể khởi tạo trực tiếp một lớp trừu tượng


