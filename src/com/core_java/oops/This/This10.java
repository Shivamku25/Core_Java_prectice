package com.core_java.oops.This;

class This
{
	This10 obj;
	
	This(This10 obj)
	{
		this.obj=obj;
	}
	void show()
	{
		System.out.println("Show mathod is called");
		System.out.println("Value of b is " +obj.b);
	}
}
public class This10 {
	int b=30;
	This10()
	{
		This x1 = new This(this);
		x1.show();
	}
	public static void main(String[] args) {
		This10 x2 = new This10();
	}

}
