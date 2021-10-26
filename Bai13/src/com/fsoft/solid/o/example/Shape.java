package com.fsoft.solid.o.example;

interface Shape {
	  public double area();
	}

// Dùng một interface và chuyển hàm tính diện tích vào trong các hình, 
// như vậy khi thêm một lớp mới ta chỉ cần thực thi trong lớp đó mà không ảnh hưởng đến các lớp khác.