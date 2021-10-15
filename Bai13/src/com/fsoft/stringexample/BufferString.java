package com.fsoft.stringexample;

public class BufferString {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append("Word");
        System.out.println(buffer);
    }
}