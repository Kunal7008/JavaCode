package com.example;

public class GetMyException extends Exception{
public GetMyException(String s) {
super(s);	
}
static void validate(int bal) throws GetMyException {
	
	if(bal<10000) {
		throw new GetMyException("balance should not be less than 10000");
	}
	else {
		System.out.println("minimum balance is maintained");
	}
}
	public static void main(String[] args) {
	try {
		validate(1000);
	}
catch (Exception e) {
	e.printStackTrace();
}
	}

}
