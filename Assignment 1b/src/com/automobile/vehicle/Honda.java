package com.automobile.vehicle;

import com.automobile.*;
import com.automobile.twowheeler.*;
//import com.automobile.vehicle.Hero;

public class Honda extends Vehicle{
	
		public String getModelName() {
			return " model is Honda";
		}
		public String getRegistrationNumber() {
			return " registration is 456";
		}
		public String getownernumber() {
			return "owner is adani ";
		}
		public int getSpeed() {
			return 200;
		}
		public void radio() {
			System.out.println("controlling the radio");
		}
		public void cdplayer() {
			System.out.println("controlling the radio");
		}
	}
	class Result{
		public static void main(String args[]) {
			Honda a = new Honda();
			System.out.println(a.getModelName());
			System.out.println(a.getRegistrationNumber());
			System.out.println(a.getownernumber());
			a.radio();
			a.getSpeed();
			Hero b = new Hero();
			System.out.println(b.getModelName());
			System.out.println(b.getRegistrationNumber());
			System.out.println(b.getownernumber());
		    
			
		}
	}


