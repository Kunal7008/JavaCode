package com.Swapping.Program;

public class SwappingUsingTempVariable {


	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("Before swapping x=:"+x);
		System.out.println("Before swapping y=:"+y);
		int temp;
		temp=x;
		x=y;
		y=temp;
		System.out.println("After swapping x=:"+x);
		System.out.println("After swapping y="+y);
		
	}

}
