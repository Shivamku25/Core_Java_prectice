package com.core_java.oops.Exception;

public class FinalizeExc1 {
	public static void main(String[] args) {
		 FinalizeExc1 x1 = new FinalizeExc1();
		System.out.println(x1.hashCode());
		System.gc();
		System.out.println("End of garbage collector");
	}
	protected void finalize()
	{
		System.out.println("Finalize method called");
	}

}
