package com.automobile.twowheeler;

import com.automobile.*;
//import com.automobile.vehicle.Honda;

public class Hero extends Vehicle{
	public String getModelName() {
		return " model is hero";
	}
	public String getRegistrationNumber() {
		return " regististration is 123";
	}
	public String getownernumber() {
		return "owner is ambani ";
	}
	public int getSpeed() {
		return 100;
	}
	public void radio() {
		System.out.println("controlling the radio");
	}
}



