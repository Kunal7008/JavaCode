package com.deepcopy;
class Prawn{
	int x;
	int y;
	public Prawn(Prawn p) {
		this.x=p.getX();
		this.y=p.getY();
	}
	public Prawn() {
		// TODO Auto-generated constructor stub
	}
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
public class Fish {

	public static void main(String[] args) {
	Prawn p1= new Prawn();
	p1.x=10;
	p1.y=20;
	Prawn p2= p1;
	p2.x=123;
	System.out.println(p1.x);
	System.out.println(p2.x);
	
	
	}

}
