package com.nt;

public class ClassF {
	public String firstHalf(String str) {
		return str.substring(0, str.length()/2);	
	}
	public static void main(String[] args) {
		 ClassF sg=new ClassF();
		 String result=sg.firstHalf("GOURA");
		 System.out.println(result);
	}

}
