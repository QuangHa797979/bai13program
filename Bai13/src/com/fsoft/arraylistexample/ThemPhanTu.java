package com.fsoft.arraylistexample;

import java.util.*;
public class ThemPhanTu {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("str 0");
        strs.add("str 1");
        strs.add("str 2");
        strs.add("str 3");
        System.out.println(strs);
        strs.add(2, "deft");
        System.out.println(strs);
    }
}
