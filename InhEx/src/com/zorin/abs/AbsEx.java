package com.zorin.abs;

abstract class Training {
	abstract void name();
	abstract void email();
}

class Lakshma extends Training {

	@Override
	void name() {
		System.out.println("Name is Lakshma Reddy...");
	}

	@Override
	void email() {
		System.out.println("Email Laxmareddy@gmail.com");
	}
}

class Suhail extends Training {

	@Override
	void name() {
		System.out.println("Name is Suhail...");
	}

	@Override
	void email() {
		System.out.println("Email suhail@gmail.com");
	}
}
public class AbsEx {
	public static void main(String[] args) {
		Training[] arr=new Training[] {
			new Suhail(),
			new Lakshma()
		};
		for (Training t : arr) {
			t.name();
			t.email();
		}
	}
}
