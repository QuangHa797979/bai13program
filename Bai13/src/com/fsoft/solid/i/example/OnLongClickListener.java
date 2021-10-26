package com.fsoft.solid.i.example;

import javax.swing.text.View;

/**
 * interface được tạo ra khi người dùng click và giữ
 */
public interface OnLongClickListener {
    /**
     * Called when a view has been clicked and held.
     *
     * @param v The view that was clicked and held.
     *
     * @return true if the callback consumed the long click, false otherwise.
     */
    boolean onLongClick(View v);
}