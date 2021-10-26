package com.fsoft.longestommonprefix;

import java.util.Arrays;

public class Main {

    /* Driver Function to test other function */
//    public static void main(String[] args)
//    {
//    	Common cm = new Common();
//        String[] input = {"abcdeksforgeekss", "abcdeksgeekss", "abcdekgeekss", "abcdezergeekss"};
//        System.out.println( "The longest Common Prefix is : " +
//        		cm.longestCommonPrefix(input));
//    }
	    public static void main(String args[]) {
	        String[] arr = {"eekssforabcde", "geekssksabcde", "geekssabcde", "geeksszerabcde"};
	        int size = arr.length;
	        // The longest common prefix of an empty array is "".
	        if (size == 0){
	          System.out.println("Longest common prefix: "); 
	        }
	        // The longest common prefix of an array containing 
	        // only one element is that element itself.
	        else if (size == 1){
	          System.out.println("Longest common prefix: " + arr[0]);
	        }
	        else{
	          // Sort the array
	        	String[] arr2 = {"aaa", "bbb", "ccc", "ach", "bca", "bcae"};         	
	           Arrays.sort(arr2);
	           for (String string : arr2) {
	        	   System.out.println(string);
			}
	           int length = arr[0].length();
	           StringBuilder res = new StringBuilder();
	           // Comapre the first and the last strings character
	           // by character.
	           for(int i = 0; i < length; i++){
	             // If the characters match, append the character to the result.
	             if(arr[0].charAt(i) == arr[size - 1].charAt(i)){
	               res.append(arr[0].charAt(i));
	             }
	             // Else, stop the comparison.
	             else{
	               break;
	             }
	           }
	           String result = res.toString();
	           System.out.println("Longest common prefix: " + result);
	        } 
	    }
	}
