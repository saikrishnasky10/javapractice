package com.project;

public class ex {

	public static void main(String[] args) {
		int a =10;
		int b =0;
//		int c =a/b;
		try {
			int c =a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("exception handless");
		}
		 

	}

}
