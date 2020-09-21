package com.zorin.inh;

class Test {
	public void show() {
		System.out.println("Show From Test...");
	}
}

class Alpha extends Test {
	public void show() {
		super.show();
		System.out.println("Show from Alpha...");
	}
}
public class Quiz {
	public static void main(String[] args) {
		Alpha obj = new Alpha();
		obj.show();
	}
}
