package com.core_java.oops.String;

public class Asciiatoz {
	public static void main(String[] args) {
		for (int asciiValue = 97; asciiValue <= 122; asciiValue++) {
			char asciiChar = (char) asciiValue;
			System.out.println("ASCII character: " + asciiChar);
			System.out.println("ASCII value: " + asciiValue);
		}
	}
}
