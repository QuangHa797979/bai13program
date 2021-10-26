package com.fsoft.lambdaexceptionexample;

import java.util.*;  
public class Example4{  
    public static void main(String[] args) {       
       List<String> list=new ArrayList<String>();  
       list.add("Rick");         
       list.add("Negan");       
       list.add("Daryl");         
       list.add("Glenn");         
       list.add("Carl");                
       list.forEach(          
           // lambda expression        
           (names)->System.out.println(names)         
       );     
    }  
}

// Tạo nhiều lambda trong vòng lặp forEach.