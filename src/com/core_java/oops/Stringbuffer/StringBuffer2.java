package com.core_java.oops.Stringbuffer;

public class StringBuffer2 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("india");
		StringBuffer s2 = s1.replace(2,4,"ee");
		System.out.println(s1);
		System.out.println(s2);

	}

}
