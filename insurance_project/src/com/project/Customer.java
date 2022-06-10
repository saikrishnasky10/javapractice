package com.project;
class Insurance{
	int clients=40, leads=0;
//	int c =clients/leads;
	String policy="new_policy";
	String policy_2=null;
	void lead_div() {
		try {
			System.out.println(policy.length());
			System.out.println(policy_2.length());
		int c =clients/leads;
//		System.out.println("result is "+ c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
//			System.out.println(c);
		}
		catch(NullPointerException a) {
			a.toString();
		}
		System.out.println("exception handled");
	}
}

public class Customer {
   
	public static void main(String[] args) {
		Insurance sbi = new Insurance();
		sbi.lead_div();
	 
}
}
