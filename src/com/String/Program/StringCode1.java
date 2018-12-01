package com.String.Program;

public class StringCode1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abcdfe345678";
StringBuffer sb= new StringBuffer(s1);
sb.reverse();
System.out.println(sb);
int i=10;
System.out.println(i++);
System.out.println(i);
char[] arr=s1.toCharArray();
System.out.println(arr);
for(i=s1.length()-1;i>=7;i--) {
	System.out.println(arr[i]);
}
	}

}
