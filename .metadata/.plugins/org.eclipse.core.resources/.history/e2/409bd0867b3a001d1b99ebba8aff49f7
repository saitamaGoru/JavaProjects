package fig06_03;

import java.util.Scanner;

public class MaximumFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter three integers separated by spaces:");
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		int result = maximum(number1,number2,number3);
		
		MaximumFinder maximumFinder = new MaximumFinder();
		maximumFinder.simpleMethod();
		
		System.out.println("Maximum is:" + result);
	}
		
		public static int maximum (int num1, int num2, int num3)
		{
			int maximumValue = num1;
			
			if(num2>maximumValue)
				maximumValue = num2;
			
			if(num3>maximumValue)
				maximumValue = num3;
			
			return maximumValue;
		}
		public void simpleMethod()
		{
			System.out.println("I am simple!");
		}

}
