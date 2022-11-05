package com.bridgelabz;

import java.util.Scanner;

public class NameUsingCommandLine {
	public static void main(String[] args) {

		String stringVar;
		Scanner s = new Scanner(System.in);
		System.out.println("Input the name ");

		stringVar = s.nextLine();
		System.out.println("Hello" + " " + stringVar);
	}
}
