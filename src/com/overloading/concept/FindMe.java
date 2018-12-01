package com.overloading.concept;

public class FindMe {
public int data(int a,int b) {
	return(a+b);
}
public int data(int a,int b,int c) {
	return a+b+c;
}
	public static void main(String[] args) {
		FindMe findMe= new FindMe();
		//findMe.data(23, 45);
System.out.println(findMe.data(23, 67));
System.out.println(findMe.data(43, 567, 98754));
	}

}
