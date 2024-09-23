package com.practice;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int original=num;
		int temp;
		int check=0;
		while(num>0) {
			temp=num%10;
			check=check+(temp*temp*temp);
			num=num/10;
			
		}
		if(original==check) {
			System.out.println("It is armstrong");
		}
		else {
			System.out.println("Not an armstrong");
		}

	}

}
