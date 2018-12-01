package com.Assigning.reference.to.another;

import java.awt.Dimension;

public class ReferenceTest {

	public static void main(String[] args) {
		Dimension s1= new Dimension(5, 10);
		System.out.println("s1.height= "+s1.height);
		Dimension b1=s1;
		b1.height=30;
		System.out.println("s1.height= "+s1.height+"after change to b");
	}

}
