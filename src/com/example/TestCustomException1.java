package com.example;
class InvalidAgeException extends Exception{
	 InvalidAgeException(String s) {
	super(s);	
	}
}
public class TestCustomException1 {
static void validate(int age) throws InvalidAgeException {
	if(age<18) {
		throw new InvalidAgeException("not valid");
	}
	else
		System.out.println("valid age");
}
	public static void main(String[] args) {
		try {
			validate(13);
		}
		catch (Exception e) {
			System.out.println("exception occured:"+e);
			System.out.println("print rest of the code");
		}

	}

}
