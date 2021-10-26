package com.fsoft.lambdaexceptionexample;

import java.awt.*;  
public class ButtonListenerNewWay {  
   public static void main(String[] args) {  
      Frame frame=new Frame("ActionListener java8");  
      
      Button b=new Button("Click Here");  
      b.setBounds(50,100,80,50); 
   
      b.addActionListener(e -> System.out.println("Hello World!")); 
      frame.add(b);
   
      frame.setSize(200,200);  
      frame.setLayout(null);  
      frame.setVisible(true);   
   }
}

// Bằng cách sử dụng biểu thức Lambda: Thay vì tạo lớp bên trong ẩn danh, chúng ta có thể tạo biểu thức lambda như thế này
// Code ngắn gọn hơn