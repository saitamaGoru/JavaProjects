package exercise2;

import java.util.Scanner;

public class Addition {
 /*
  * Author: Pritpal 
  * date: 9th sept, 2022
  * Purpose: To add two numbers
  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
	     int num1 = sc.nextInt(); //taking first input from user. 
	    System.out.println("Enter the second number:");
	     int num2 = sc.nextInt(); //taking second input from user. 
	     int sum = num1+num2;
	     System.out.printf("Sum %d", sum);
	     sc.close();
	     
	     
	}

}
