package com.syntax.class09;

public class NestedLoop {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.println("hello");
			
			for (int j = 1; j <= 3; j++) {
				System.out.println("Bye");
			}
		}
	}

}
