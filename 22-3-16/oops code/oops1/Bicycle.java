package oops1;

import oops.Vehicle;

public class Bicycle  extends Vehicle{

	Bicycle(double speed) {
		super(speed);
	}

	public String getType() {
		// TODO Auto-generated method stub
		System.out.println(numWheels);
	//	Integer.m
		return "bicycle";
	}
	

}
