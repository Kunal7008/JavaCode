package com.exception.handling;
class MiniBalanceException extends Exception{
	public MiniBalanceException(String s1) {
		super(s1);
	}
}
public class CustomizeException {
static void validate1(int balance) throws MiniBalanceException {
if(balance<1000) {
	throw new MiniBalanceException("balance is less than 1000");
}
}
	public static void main(String[] args) {
		try {
			validate1(12);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
