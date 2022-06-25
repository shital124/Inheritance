package com.inhritance;

public class Child extends Parent{
	void m2() {
		
		System.out.println("m2 method child");
	}
	
	static void m1() {
		
		System.out.println("m1 method - child");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.m1();
		p.m2();
	}
}
