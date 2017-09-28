package tutorials;

import java.util.Scanner;

public class TriangleProgram {

	public static void main(String[] args) 
	{
	
	Scanner input = new Scanner(System.in);
	double a, b, c;
	double side;
	double side2;
	double side3;
	double totalA;
	double totalP;
	String choiceYes;
	
	do
	{	
	System.out.println("You have a right triangle with you! What are the measurments of one of the sides? >> ");
	a = input.nextDouble();
	System.out.println("Please enter the other side >> ");
	b = input.nextDouble();
	
	side = a * a;
	side2 = b * b;
	side3 = side + side2;

	totalP = a + b + side3;
	totalA = a * b / 2;
	
	System.out.println(side + " is the first number * 2 and " + side2 + " is the second so the pythagorean answer is " + side3);
	System.out.println("The perimeter is " + totalP);
	System.out.println("The area is " + totalA);
	
	System.out.println("Would you like to do another triangle? Yes or No >> ");
	choiceYes = input.nextLine();
	}while("Yes".equalsIgnoreCase(choiceYes));
	
	
	}
	
}
