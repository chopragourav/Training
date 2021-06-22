package com.nt;

public class ClassD {
	public String extraEnd(String str) {
		String s=str.substring(str.length()-2);
		return s+s+s;
	}
	public static void main(String[] args) {
		 ClassD sg=new ClassD();
		 String result=sg.extraEnd("Hello");
		 System.out.println(result);
	}

}
