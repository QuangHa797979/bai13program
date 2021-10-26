package com.fsoft.arraylistexample;

import java.util.*;
public class XoaPhanTu {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("str 0");
        strs.add("str 1");
        strs.add("str 2");
        strs.add("str 3");
        System.out.println(strs);
        // remove by value
        strs.remove("str 0");
        System.out.println(strs);
        // remove by index
        strs.remove(2);
        System.out.println(strs);
    }
}