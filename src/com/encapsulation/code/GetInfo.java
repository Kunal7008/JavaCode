package com.encapsulation.code;

public class GetInfo {
private int amount;
private String name;
public int getvalue() {
return amount;	
}
public String getname() {
	return name;
}
public int setValue(int value)
{
	this.amount=value;
	return value;
}
public String setName(String name) {
	this.name=name;
	return name;
}
	public static void main(String[] args) {
	GetInfo getInfo= new GetInfo();
	/*int store=getInfo.amount;
	System.out.println(store);
	String furu=getInfo.name;
	System.out.println(furu);*/
	getInfo.setName("kunal");
	System.out.println("name is:"+getInfo.getname());

	}

}
