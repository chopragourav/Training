package com.pack1;

public class ClassF {
	static int a=0;
	int b=0;
	ClassF(){
		a++;
		b++;
		System.out.println("Static variable===>"+a);
		System.out.println("Instance variable===>"+b);
		System.out.println("------");
	}
	void display() {
		System.out.println("******Accessing static variable******");
		System.out.println(ClassF.a);
		System.out.println(a);
		System.out.println(new ClassF().a);
	}
	public static void main(String[] args) {
		new ClassF();
		new ClassF();
		new ClassF();
		System.out.println("##################################");
		new ClassF().display();

	}

}
