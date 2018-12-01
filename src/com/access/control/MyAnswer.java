package com.access.control;
class SuperClass{
	public  void showSample() {
		System.out.println("One thing");
	}
}
class SubClass extends SuperClass{
	public void showSample() {
	System.out.println("Do nothing");	
	}
}
public class MyAnswer {

	public static void main(String[] args) {
SuperClass sb= new SubClass();
sb.showSample();
	}

}
