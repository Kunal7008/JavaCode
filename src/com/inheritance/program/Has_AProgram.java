package com.inheritance.program;



class Car{
	private String color;
	private int maxspeed;
	public void carinfo() {
		System.out.println("Car color= "+color+"Max speed= "+maxspeed);
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public void setMaxspeed(int maxSpeed) {
		this.maxspeed=maxspeed;
	}
}
class Maruti extends Car{
	public void marutiStartDemo() {
		Engine MarutiEngine= new Engine();
		MarutiEngine.start();
	}
}
 class Engine {
	public void start(){
		System.out.println("Engine Started:");
	}
	public void stop(){
		System.out.println("Engine Stopped:");
	}
}
 
public class Has_AProgram {

	public static void main(String[] args) {
	Maruti myMaruti= new Maruti();
	myMaruti.setcolor("RED");
	myMaruti.setMaxspeed(220);
	myMaruti.carinfo();
	myMaruti.marutiStartDemo();
Has_AProgram ap= new Has_AProgram();
int a=ap.add(23, 45);
System.out.println(a);
	}
	public int add(int x,int y) {
		return(x+y); 
	 }
}
