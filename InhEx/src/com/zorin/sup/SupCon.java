package com.zorin.sup;

class Employ {
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Sambasiva extends Employ {

	public Sambasiva(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}
public class SupCon {
	public static void main(String[] args) {
		Sambasiva obj = new Sambasiva(1, "Siva", 88234);
		System.out.println(obj);
	}
}
