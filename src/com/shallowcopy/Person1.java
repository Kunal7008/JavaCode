package com.shallowcopy;
class Dog{
	int x;
	int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
public class Person1 {

	public static void main(String[] args) {
Dog d =new Dog();
d.x=10;
d.y=20;
Dog d1=d;//shallow copy
d1.x=31;
System.out.println(d.x);
System.out.println(d1.x);

	}

}
