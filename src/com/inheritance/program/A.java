package com.inheritance.program;
class B{
	int a=10;
	public void run() {
		System.out.println("class is running");
	}
}
public class A extends B{
int b=12;
public void run1() {
	System.out.println("class is over");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b= new A();
b.run();
A a=(A)b;
a.run();
a.run1();
	}

}
