package com.Array.Program;
class Shine{
	int x,y,z;
	
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
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
}
public class Show1 {

	public static void main(String[] args) {
	Shine shine= new Shine();
	shine.x=10;
	shine.y=20;
	shine.z=30;
	System.out.println(shine.x);
	Shine shine2=shine;
	shine2.x=12;
	System.out.println(shine2.x);
	System.out.println(shine.x);
	

	}

}
