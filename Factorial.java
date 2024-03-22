package gani.assignments;

import java.util.Scanner;

public class Factorial {
	int fact(int a){
		if (a==1)
			return a;
		else
			return a*fact(a-1);
	}

	public static void main(String[] args) {
		// factorial of given number
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		int n=sc.nextInt();
		Factorial x=new Factorial();
		int y=x.fact(n);
		System.out.print("factorial of given number is :"+y);
	}

}