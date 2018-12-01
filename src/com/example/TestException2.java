package com.example;
class InvalidBalanceException extends Exception{
	public InvalidBalanceException(String s1) {
		super(s1);
	}
}
public class TestException2 {
static void validate(int bal) throws InvalidBalanceException{
	if(bal<1000)
	{
	throw new InvalidBalanceException("balance is less than 1000 so fuck off");	
	}
}
	public static void main(String[] args) {
		try {
			validate(100);
		}
catch (Exception e) {
	e.printStackTrace();
}
	}

}
