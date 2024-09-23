package com.practice;

import java.util.Scanner;

public class PaliStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String reverse="";
   System.out.println("Enter the string");
   Scanner sc=new Scanner(System.in);
   String original=sc.nextLine();
   int length= original.length();
   sc.close();
   for(int i=length-1; i>=0; i--) {
	  reverse =reverse+original.charAt(i);
   }
   if(reverse.equalsIgnoreCase(original)) {
	   System.out.println("Palindrome string");
	   
   }
   else {
	   System.out.println("Not a palindrome");
   }
  
	}

}
