package com.enumeration.study;

public class Test1 {
enum Color{
	RED,BLUE,GREEN;
	private Color() {
		System.out.println("Constructer called for:"+this.toString());
	}
	public void colorInfo() {
		System.out.println("Universal color");
	}
}
	public static void main(String[] args) {
	Color c1=Color.BLUE;
	System.out.println(c1);
	c1.colorInfo();
	}

}
