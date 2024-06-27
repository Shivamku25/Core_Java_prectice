package com.core_java.oops.Wrapperclass;

public class Wrapper1 {

	public static void main(String[] args) {
		int i = 10;
		Integer x1 = new Integer(i);//Wrapper class ,boxing
	     String str = "Welcome";
		int j = x1.intValue();//Unboxing
		Integer a = i;//Autoboxing
		int b = a;//autounboxing
		String str2 = "123";
		int num = Integer.parseInt(str2);
		
		System.out.println(str);
		System.out.println(i);
		System.out.println(b);
		System.out.println(str2);


	}

}
