	package GameZone;

	import java.util.Scanner;

	public class PythagoreanTheorem {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			double a;
			double b;
			double c;
			double sideB;
			double sideC;
			double sideA;
			
			Scanner input = new Scanner(System.in);
			String chooseSideString = null;
			
			System.out.print("Which side do you want to solve for? \nA, B, or C>>> ");
			chooseSideString = input.nextLine();
			
			if(chooseSideString.equalsIgnoreCase("A"))
			{
				System.out.println("Please enter side for B>>> ");
				sideB = input.nextDouble();
				System.out.println("Please enter side for C>>> ");
				sideC = input.nextDouble();
				
				a = Math.sqrt(sideB) - Math.sqrt(sideC);
				
				System.out.println("Side A is " + a);
			}
			else if(chooseSideString.equalsIgnoreCase("B"))
			{
				System.out.println("Please enter side for A>>> ");
				sideA = input.nextDouble();
				System.out.println("Please enter side for C>>> ");
				sideC= input.nextDouble();
				
				b = Math.pow(sideA, 2) - Math.pow(sideC, 2);
				b = Math.sqrt(sideC);
				
				System.out.println("Side B is " + b);
			}
			else
			{
				System.out.println("Please enter side for A>>> ");
				sideA = input.nextDouble();
				System.out.println("Please enter side for B>>> ");
				sideB = input.nextDouble();
				
				c = Math.sqrt(sideA) - Math.sqrt(sideB);
				
				System.out.println("Side C is " + c);
			}
			
		}

	}