package com.fsoft.solid.o.example;


//class Tính chu vi
public class Geometry {
public final double PI = 3.141592653589793;
public double area(Object shape) throws Exception
 {
   // Dùng if để kiểm tra hình và cho ra diện tích tương ứng
   if (shape instanceof Square) {
//     Square s = (Square)shape;
//     return s.side * s.side;
//   }
//   else if (shape instanceof Rectangle) {
//     Rectangle r = (Rectangle)shape;
//     return r.height * r.width;
//   }
//   else if (shape instanceof Circle) {
//    Circle c = (Circle)shape;
//    return PI * c.radius * c.radius;
//   }
//   throw new Exception();
}
return PI;
}
}


// Open/Closed Principle
// Có thể  mở rộng 1 class, nhưng không được sửa đổi bên trong class đó

//  nếu thêm nhiều class nữa, muốn tính diện tích của nó ta lại phải sửa class Geometry, 
// phải viết thêm hàm if nữa

