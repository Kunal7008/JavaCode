package com.sweet.cash;

public class Command {
int a;
int b;
public Command() {
	this(23, 45);
}
public Command(int a,int b) {
	this.a=a;
	this.b=b;
	System.out.println("inside constructer called");
}
	public static void main(String[] args) {
		
Command cd= new Command();
	}

}
