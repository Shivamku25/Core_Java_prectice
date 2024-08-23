package com.core_java.oops.ExceptionTest;


	class TestException extends Exception {
	    public TestException(String message) {
	        super(message);
	    }
	}

	public class Exc21 {
	    public static void main(String[] args) {
	        try {
	            throw new TestException("This is a test exception");
	        } catch (TestException t) {
	            System.out.println("Got the test Exception: " + t.getMessage());
	        } finally {
	            System.out.println("Inside the finally block");
	        }
	    }
	}



