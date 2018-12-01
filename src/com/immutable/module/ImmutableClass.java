package com.immutable.module;

public final class  ImmutableClass {
private final Integer immutablefield;
private final String immutablefield2;
private ImmutableClass(Integer fd1,String fd2) {
	this.immutablefield=fd1;
	this.immutablefield2=fd2;
}
public static ImmutableClass createNewInstance(Integer fd1,String fd2) {
	return new ImmutableClass(fd1, fd2);
}
public Integer getimmutablefield() {
	return immutablefield;
}
public String getimmutablefield2() {
return immutablefield2;	
}
public String toString() {
	return immutablefield+"-"+immutablefield2;
}
}
