package com.enumeration.study;

public class Test {
enum Color{
	RED,BLUE,GREEN,WHITE;
}
	public static void main(String[] args) {
		Color t=Color.BLUE;
		System.out.println(t);
		/*Tea t1=new Tea();
Tea t1=Tea.COLD;
System.out.println(t1);*/
		Color arr[]= Color.values();
		/*for(Color col:arr) {
			System.out.println(col+" at index"+col.ordinal());
		}*/
		System.out.println(Color.valueOf("WHITE"));
	}

}
