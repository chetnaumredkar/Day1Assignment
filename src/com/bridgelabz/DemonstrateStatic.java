package com.bridgelabz;

public class DemonstrateStatic {
	//Static Variables
	static int x = 10;
	static int y;
//Static Function
	static void func(int z) {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}

//Static Block
	static {
		System.out.println("Running static initialization block.");
		y = x + 5;
	}

	public static void main(String args[]) {
		//No need to Create Object
		func(8);
	}
}
