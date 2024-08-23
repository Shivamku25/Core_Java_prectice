package com.core_java.oops.Inheritance;

class Complex {
	int real, image;

	public Complex(int r,int i) {
		this.real = r;
		this.image = i;
	}

	public void showC() {
		System.out.print(this.real + " +i" + this.image);
	}

	public static Complex add(Complex n1, Complex n2) {

		// creating blank complex number
		// to store result
		 Complex res = new Complex(0, 0);

		// adding real parts of both complex numbers
		res.real = n1.real + n2.real;

		// adding imaginary parts
		res.image = n1.image + n2.image;

		// returning result
		return res;
	}

	public static void main(String arg[]) {

		Complex c1 = new Complex(4,5);
		Complex c2 = new Complex(10,5);

		System.out.print("first Complex number: ");
		c1.showC();

		System.out.print("\nSecond Complex number: ");
		c2.showC();

		Complex res = add(c1,c2);

		System.out.println("\nAddition is :");
		res.showC();
	}
}
