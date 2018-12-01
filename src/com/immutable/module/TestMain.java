package com.immutable.module;

public class TestMain {

	public static void main(String[] args) {
		ImmutableClass im=ImmutableClass.createNewInstance(100,"test1");
		System.out.println(im);
		tryModification(im.getimmutablefield(),im.getimmutablefield2());
		

	}
	private static void tryModification(Integer immutablefield,String immutablefield2) {
	immutablefield=1000;
	immutablefield2="get Changed";
	}

}
