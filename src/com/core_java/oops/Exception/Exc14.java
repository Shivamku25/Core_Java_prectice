package com.core_java.oops.Exception;

public class Exc14 {
	public static void main(String[] args) {
		try {
			
		System.out.println("Main started");
		String data = args[0];
		int x = Integer.parseInt(args[1]);
		int res = 10 / x;
		System.out.println("Result is: " + res);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("garbar hai");
		}
		System.out.println("Main end");
	}
}


