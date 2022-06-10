package com.project;

abstract class Agent{
	abstract void claims();
	abstract void insu_type();
}

public class Innerdemo {
  public static void main(String args[]) {
	  Agent raju = new Agent() {
		  void claims() {
			  System.out.println("verifying leads");
		  }
		  void insu_type() {
			  System.out.println("health");
		  }
	  };
	  raju.claims();
	  raju.insu_type();
//	  ramesh.claims();
  }
 
}
