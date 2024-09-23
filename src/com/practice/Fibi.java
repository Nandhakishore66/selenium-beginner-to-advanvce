package com.practice;

import java.util.Scanner;

public class Fibi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=0;
		int num2=1;
		int nextNum;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		sc.close();
		for(int i=0;i<length;i++) {
			System.out.print(num1+" ");
			nextNum=num1+num2;
			num1=num2;
			num2=nextNum;
		}

	}

}
