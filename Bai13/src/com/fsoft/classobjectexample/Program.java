package com.fsoft.classobjectexample;

public class Program {
		public static void main(String[] args) {
			Account account1 = new Account(); // phương thức main gọi đến object account
			account1.setId(1);  // gán cho id của account bằng 1
			account1.setName("Nguyen Van A");
			
			Account account2 = new Account();
			account2.setId(1);
			account2.setName("Nguyen Van A");
			
			if(account1.equals(account2)) {
				System.out.println("2 account giống nhau");
			}else {
				System.out.println("2 account khác nhau");
			}
		}
}
