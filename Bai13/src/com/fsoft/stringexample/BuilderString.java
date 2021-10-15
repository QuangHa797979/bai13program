package com.fsoft.stringexample;

public class BuilderString {
    public static void main(String[] args) {
        StringBuffer builder = new StringBuffer("Hello");
        builder.append("Word");
        System.out.println(builder);
    }
}