package string;

import java.util.Scanner;

public class Profit {
	public static void main(String[] args) {
		double cost=0.0;
		double revenue=0.0;
		double profit=0.0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Revenue: ");
		revenue=sc.nextDouble();
		System.out.println("Enter the Cost \t");
		cost=sc.nextDouble();
		profit=(revenue-cost)/revenue;
		System.err.println("Profit is "+profit);
		sc.close();
		
	}
}
