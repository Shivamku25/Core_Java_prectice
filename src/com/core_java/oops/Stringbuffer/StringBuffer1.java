package com.core_java.oops.Stringbuffer;

public class StringBuffer1 {

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("india");
		StringBuffer s2 = s1.append(" is a great country ");
		StringBuffer s3 = s1.append(" is a great country ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
