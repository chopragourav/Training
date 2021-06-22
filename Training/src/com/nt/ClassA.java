package com.nt;

public class ClassA {
	public String helloName(String name) {
		return "Hello "+name+"!";
	}
	public static void main(String[] args) {
		 ClassA sg=new ClassA();
		 String result=sg.helloName("Java");
		 System.out.println(result);
	}

}
