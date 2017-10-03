package Exercises;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		double sideA, sideB, sideC;
		Scanner input = new Scanner (System.in);
		String chooseSideString = null;
		
		System.out.println("What Triangle do you want to solve for? Please enter which side you are solving for>>>> \nA\nB\nC");
		chooseSideString = input.nextLine();
		
		if(chooseSideString.equalsIgnoreCase("A"));
		{
			System.out.println("Please enter side B");
			sideB = input.nextDouble();
			
			System.out.println("Please enter side C");
			sideC = input.nextDouble();
			
			sideA = Math.pow(sideC, 2) - Math.pow(sideB, 2);
			
			System.out.println("Side A is " + sideA);
			
			
			// B squared = c squared - a squared
			// A squared = c squared - b squared
			// C squared = a squared + b squared
		}
		
	}

}
