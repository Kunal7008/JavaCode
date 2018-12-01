package com.access.control;
abstract class  Bike{
	public String brandName() {
		return "kunal";
	}
	public abstract void goUpHill();
}
public class Vehicle extends Bike {
public  void goUpHill() {
	System.out.println("Get all the vehicle information");
}
	public static void main(String[] args) {
		
Vehicle as= new Vehicle();
as.goUpHill();
	}

}
