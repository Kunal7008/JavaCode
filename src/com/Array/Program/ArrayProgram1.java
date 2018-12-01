package com.Array.Program;

public class ArrayProgram1 {

	public static void main(String[] args) {
//int arr[]= {12,23,45,65};
		//int arr[] = new int[5];
String s1="gdferey456789";
char[] arr= s1.toCharArray();
for(char output:arr) {
	System.out.println(output);
	
}
String s2="jhgftder879435";
char arr1[]=s2.toCharArray();
System.out.println(arr1);
StringBuffer ab= new StringBuffer(s2);
System.out.println(s1.concat(s2));
//System.out.println(ab.lastIndexOf(s2));

/*for(int i=0;i<arr.length;i++) {
	 
	System.out.println(arr[i]);
	
	}*/

	}

}
