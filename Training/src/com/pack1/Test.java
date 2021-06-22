package com.pack1;

public class Test {
	void show() {
		String s1="java";
		String s2=" is Awesome";
		System.out.println(s2.intern());
	}
	public static void main(String[] args) {
		new Test().show();
	}

}
