package com.pack1;

public class ClassC {
	String meth1(int a, int b) {
		System.out.println(10);
		System.out.println((54 + a) - b);
		int value = new ClassC().meth5();
		System.out.println(value);
		return "Java";
	}

	int meth2(int a) {
		System.out.println(75);
		int b = 5;
		System.out.println(b - a);
		return (5 * 5) - b;
	}

	void meth3() {
		System.out.println("Start");
		System.out.println(new ClassC().meth4());
		System.out.println(40);
	}

	String meth4() {
		System.out.println("today is saturday");
		return new ClassC().meth1(4, 8);
	}

	int meth5() {
		ClassC obj = new ClassC();
		System.out.println(99);
		return obj.meth2(5);
	}

	public static void main(String[] args) {
		ClassC aobj = new ClassC();
		aobj.meth3();
	}
}
