package com.Array.Program;

public class ReturningArray {
public int[] getValue(int a, int b) {
int[] arr= new int[5];
arr[0]=a+b;
arr[1]=a-b;
return arr;
}

	public static void main(String[] args) {
		ReturningArray a= new ReturningArray();
		
int[] i=a.getValue(12, 45);
System.out.println("The result is:"+i[0]);
System.out.println("The result is:"+i[1]);


	}

}
