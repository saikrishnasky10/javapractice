package com.calculator;
//package com.calculator;

public class Calculator {
	  static public int powerInt(int num1, int num2) {
		  return (int) Math.pow(num1, num2);
	  }
	 static public int powerDouble( double num1 , int num2) {
		 return (int) Math.pow(num1, num2);
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Calculator add = new Calculator();
       System.out.println( Calculator.powerInt(4, 7));
       Calculator.powerDouble(67.2, 5);
       
	}
}

