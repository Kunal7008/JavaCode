package com.Array.Program;


public class ReturningAnArray {
public int[] getSum(int a,int b) {
	int[] arr= new int[3];
	arr[0]=a+b;
	arr[1]=a-b;
	arr[2]=a*b;
	return arr;
}
	public static void main(String[] args) {
		ReturningAnArray ar= new ReturningAnArray();
	int[] abc=ar.getSum(609, 49);
	System.out.println("the result is:"+abc[0]);

	}

}
