package com.nt;

public class ClassC {
	public String makeOneWord(String out, String word) {
		return out.substring(0, 2)+word+out.substring(2);
	}
	public static void main(String[] args) {
		 ClassC sg=new ClassC();
		 String result=sg.makeOneWord("<<>>", "Yay");
		 System.out.println(result);
	}

}
