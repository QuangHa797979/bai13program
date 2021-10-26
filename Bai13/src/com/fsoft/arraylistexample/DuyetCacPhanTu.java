package com.fsoft.arraylistexample;

import java.util.ArrayList;

public class DuyetCacPhanTu {

	 public static void main(String args[]) {
	        ArrayList<String> alist = new ArrayList<>();
	        alist.add("Gregor Clegane");
	        alist.add("Khal Drogo");
	        alist.add("Cersei Lannister");
	        alist.add("Sandor Clegane");
	        alist.add("Tyrion Lannister");
	        for(int i = 0; i < alist.size(); i++) {
	            System.out.println(alist.get(i));
	        }
	    }
	 
//	  ArrayList<String> alist = new ArrayList<>();
//      alist.add("Gregor Clegane");
//      alist.add("Khal Drogo");
//      alist.add("Cersei Lannister");
//      alist.add("Sandor Clegane");
//      alist.add("Tyrion Lannister");
//      //iterating ArrayList
//      for (String str : alist) {
//          System.out.println(str);
//      }
	 
//	  ArrayList<String> alist = new ArrayList<>();
//      alist.add("Gregor Clegane");
//      alist.add("Khal Drogo");
//      alist.add("Cersei Lannister");
//      alist.add("Sandor Clegane");
//      alist.add("Tyrion Lannister");
//      alist.forEach(str -> System.out.println(str));
//  }


  }
	

