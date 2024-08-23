package com.core_java.oops.Inheritance;

  class P1 {
	public void display() {
		System.out.println("Hello");
	}
}

  class Final3 extends P1 
  {
	 
	public void display()
	{
		 this.display();
		System.out.println("hii");
	}
  
	public static void main(String arg[]) {
		Final3 x1 = new Final3();
		x1.display();
	}

}

