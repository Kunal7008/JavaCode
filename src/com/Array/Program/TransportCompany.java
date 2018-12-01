package com.Array.Program;
class CarClass{
	String carName;
	int carId;
	CarClass(String name,int id){
		carName=name;
		carId=id;
	}
}
 class Driver extends CarClass{
	 String driverName;
	 Driver(String name,String cname,int cid){
		 super(cname,cid); 
		 driverName=name;
	 }
	 
 }
public class TransportCompany {
	public static void main(String[] a) {
Driver obj=new Driver("Sachi","Maruti", 2325);
System.out.println(obj.driverName+" is a driver of car id: " +obj.carId);
}
}
