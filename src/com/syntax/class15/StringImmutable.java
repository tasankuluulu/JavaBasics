package com.syntax.class15;

public class StringImmutable {
	public static void main(String[] args) {
		String str = "Today is a good day";
		str = str.replace("good", "amazing");
		System.out.println(str);
		str.concat(". I love Sundays");
		System.out.println(str);
		str.toUpperCase();
		System.out.println(str);
	}

}
