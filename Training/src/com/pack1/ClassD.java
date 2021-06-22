package com.pack1;

public class ClassD {
	void display(){
		int input=4;
		switch (input) {
		default:
			System.out.print("4");
			
		case 1:
			System.out.print("1");
			
		case 2:
			System.out.print("2");
			break;
		}
	}
	public static void main(String[] args) {
		new ClassD().display();

	}

}
