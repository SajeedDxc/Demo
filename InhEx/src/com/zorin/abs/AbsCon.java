package com.zorin.abs;

abstract class Employ {
	
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

class Siva extends Employ {

	public Siva(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

class Sandeep extends Employ {

	public Sandeep(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}
public class AbsCon {
	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Siva(1, "Samba Siva", 88234),
			new Sandeep(3, "Sandeep", 88211)
		};
		for (Employ e : arr) {
			System.out.println(e);
		}
	}
}
