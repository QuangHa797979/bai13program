package com.fsoft.solid.i.example;

import javax.swing.text.View;

/**
 * interface được tạo ra bắt sự kiện khi người dùng click 
 */
public interface OnClickListener {
    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
     void onClick(View v);
}
