package com.epam;

import java.util.Scanner;

public class Calculate {
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return (a*b);
	}

	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return (a/b);
	}

	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return (int)Math.abs(a-b);
	}
		public static void main(String []args) {
			Scanner sc=new Scanner(System.in);
			Calculate c=new Calculate();
			System.out.print("Enter Value for \"A\" : ");
			int a=sc.nextInt();
			System.out.print("Enter Value for \"B\" : ");
			int b=sc.nextInt();
			System.out.println("A+B = "+c.add(a, b));
			System.out.println("A-B = "+c.sub(a, b));
			System.out.println("A*B = "+c.mul(a, b));
			System.out.println("A/B = "+c.div(a, b));
			
		}
}
