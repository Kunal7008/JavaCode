package com.example;
class Complex{
	private double re,im;
	public Complex(double re,double im) {
	this.re=re;
	this.im=im;
	}
	//copy constructer
	 Complex(Complex c) {
		System.out.println("copy constructer called");
		re=c.re;
		im=c.im;
	}
	@Override
	public String toString() {
		return "Complex [re=" + re + ", im=" + im + "]";
	}
	 
}
public class Main {

	public static void main(String[] args) {
		Complex c=new Complex(13, 45);
		Complex c1=new Complex(c);
		Complex c2=c;
		System.out.println(c1);
		//System.out.println(c2);
		//System.out.println(c);
	}

}
