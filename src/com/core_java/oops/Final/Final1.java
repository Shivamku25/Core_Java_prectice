package com.core_java.oops.Final;

public class Final1 {
	final String school;
	Final1()
	{
		school="RSVM";
		System.out.println("School name is " +school);
	}
	void msg(String name)
	{
		name="Java";
		System.out.println(name);
	}
	public static void main(String[] args) {
		Final1 x1 = new Final1();
		x1.msg(null);
	}

}
