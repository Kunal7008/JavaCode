package com.exception.handling;

public class NullException {

	public static void main(String[] args) {
		try {
		String s=null;
		System.out.println(s.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
