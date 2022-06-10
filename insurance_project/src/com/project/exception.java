package com.project;

class Claim{
	void data() {
	String agents[] = {"rahul","anji","ramesh","suresh"};
	try {
		System.out.println(agents[6]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("out of index");
	}
	System.out.println("exception handled successfully");
}
}
public class exception {

	public static void main(String[] args) {
		Claim sbi = new Claim();
		sbi.data();
      
	}

}
