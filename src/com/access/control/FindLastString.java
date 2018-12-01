package com.access.control;

public class FindLastString {
static String s1="hgsdfer12345dfd";

	public static void main(String[] args) {
		char[] arr=s1.toCharArray();
		for(int i=s1.length()-1;i>=arr.length-5;i--) {
			System.out.println(arr[i]);
		}
	}

}
