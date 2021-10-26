package com.fsoft.methodreferencesexample;

import java.util.Arrays;
public class Example3 {  
 
   public static void main(String[] args) {  
    String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
    String string = "abcefh";
    System.out.println(string.compareTo("aDc"));
    /* Method reference to an instance method of an arbitrary 
     * object of a particular type
     */
    Arrays.sort(stringArray, String::compareToIgnoreCase);
    for(String str: stringArray){
        System.out.println(str);
    }
   }  
}
