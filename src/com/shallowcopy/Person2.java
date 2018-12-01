package com.shallowcopy;

public class Person2 {
	int x,y,z;
public Person2(int x,int y,int z) {
	this.x=x;
	this.y=y;
	this.z=z;
	
}
public Person2(Person2 person) {
x=person.x;
y=person.y;
z=person.z;
}
	public static void main(String[] args) {
		Person2 pr= new Person2(12, 34, 22);
		//System.out.println(pr.x);
        Person2 pr1=pr;//shallow copy
        
        pr1.x=23;
        System.out.println(pr.x);
        System.out.println(pr1.x);
		

	}

}
