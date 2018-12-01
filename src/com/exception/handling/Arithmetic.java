package com.exception.handling;

public class Arithmetic {

	public static void main(String[] args) {
		try {
			int i=10/0;
		}
catch (ArithmeticException e) {
	System.out.println(e.getMessage());
	System.out.println("it cannot perform above operation");
	
}
	}

}
