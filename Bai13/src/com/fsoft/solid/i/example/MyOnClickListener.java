package com.fsoft.solid.i.example;

import javax.swing.text.View;

public interface MyOnClickListener {
    void onClick(View v);
    boolean onLongClick(View v);
}

// Interface Segregation Principle
// Thay vì dùng 1 interface lớn, ta nên tách thành nhiều interface nhỏ, 
// với các mục đích khác nhau

// Khi 1 interface lớn, nhiều methods. Việc implements sẽ khá cực khổ, ngoài ra còn có thể dư thừa vì 1 class không cần dùng hết các method. 
// Khi tách interface ra thành nhiều interface nhỏ, gồm các method liên quan tới nhau, việc implement và quản lý sẽ dễ hơn.