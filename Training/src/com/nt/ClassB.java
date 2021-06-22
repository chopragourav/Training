package com.nt;

public class ClassB {
	public String makeAbba(String a, String b) {
		return a+b+b+a;
	}
	public static void main(String[] args) {
		 ClassB sg=new ClassB();
		 String result=sg.makeAbba("Yo", "Alice");
		 System.out.println(result);
	}

}
