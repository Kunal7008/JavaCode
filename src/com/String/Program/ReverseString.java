package com.String.Program;

public class ReverseString {

	public static void main(String[] args) {
		String s1="kunal";
		char[] arr=s1.toCharArray();
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(arr[i]);
		}

	}

}
