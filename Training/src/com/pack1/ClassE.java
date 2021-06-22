package com.pack1;

public class ClassE {
	void meth1() {
		System.out.println("--------meth1()--------");
		for(int i=1;i<=3;i++) {
			System.out.println("count===>"+i);
		}
		System.out.println("meth1() execution completed");
	}
	void meth2() {
		int i=1;

		for(;i<=1;) {
			System.out.println("count===>"+i);
			i++;
		}
	}
	void meth3() {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				return;
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ClassE eobj=new ClassE();
		eobj.meth3();
	}

}
