package com.access.control;

public class MyInformation {
public int getRecord(int filename,final int recNumber) {
	
	return(filename+recNumber);
	
}
	public static void main(String[] args) {
		
MyInformation mi= new MyInformation();
System.out.println(mi.getRecord(34, 56));
mi.getRecord(34, 56);
	}

}
