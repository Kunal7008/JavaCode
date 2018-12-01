package com.String.Program;

public class LastFiveElements {

	public static void main(String[] args) {
		String s1="hgfsfdre5338728728877ffgfg";
		char[] arr=s1.toCharArray();
		//System.out.println(arr);
		for(int i=s1.length()-1;i>=s1.length()-5;i--) {
			System.out.println(arr[i]);
		}

	}

}
