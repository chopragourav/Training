package com.nt;

public class ClassE {
	public String firstTwo(String str) {
		if(str.length()<2)
			return str;
		else
			return str.substring(0,2);
		
	}
	public static void main(String[] args) {
		 ClassE sg=new ClassE();
		 String result=sg.firstTwo("");
		 System.out.println(result);
	}

}
