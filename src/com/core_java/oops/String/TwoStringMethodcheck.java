package com.core_java.oops.String;

class Testingclass
{
	public static void display(String S)
	{
		System.out.println(S);

	}
}
public class TwoStringMethodcheck {

	public static void main(String[] args) {
		int i = 10;
		char d = 'h';
		boolean t = true;
		Testingclass.display(Integer.toString(i));
		Testingclass.display(Character.toString(d));
		Testingclass.display(Boolean.toString(t));

		
	}

}
