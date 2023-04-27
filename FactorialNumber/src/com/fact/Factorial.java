package com.fact;

import java.util.Scanner;

public class Factorial {

	public static void getFact(int num) {
	int fact=1;

		for(int i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println(fact);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any number:= ");
        int num=sc.nextInt();
        getFact(num);
        
	}

}
