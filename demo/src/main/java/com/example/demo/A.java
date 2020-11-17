package com.example.demo;

public class A {
	public static void main(String[] args) {
		A a1 = new A();
		B b = new B();
		b.four();
	}

	void one() {
		System.out.println("A-one");
	}

	void two() {
		System.out.println("A-two");
	}
}

class B extends A {
	void two() {
		System.out.println("B-two");
	}

	void three() {
		System.out.println("B-three");
	}

	void four() {
		System.out.println("B-four");
	}
}