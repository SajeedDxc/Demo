package com.zorin.intf;

interface ITravel {
	void idProof();
	void ticket();
}

class Sandeep implements ITravel {

	@Override
	public void idProof() {
		System.out.println("Aadhar Card...");
	}

	@Override
	public void ticket() {
		System.out.println("Its Economy class...");
	}
}

class Suhail implements ITravel {

	@Override
	public void idProof() {
		System.out.println("Passport...");
	}

	@Override
	public void ticket() {
		System.out.println("Its Business Class...");
	}
}

public class IntfEx {
	public static void main(String[] args) {
		ITravel[] arr = new ITravel[] {
			new Suhail(),
			new Sandeep()
		};
		for (ITravel i : arr) {
			i.idProof();
			i.ticket();
		}
	}
}
