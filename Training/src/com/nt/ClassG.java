package com.nt;

public class ClassG {
	public String doubleChar(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			s=s+str.charAt(i)+str.charAt(i);
		}
		return s;	
	}
	public static void main(String[] args) {
		 ClassG sg=new ClassG();
		 String result=sg.doubleChar("Gourav");
		 System.out.println(result);
	}

}
