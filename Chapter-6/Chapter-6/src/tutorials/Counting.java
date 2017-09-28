package tutorials;

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int choice1;
		int response;
		
		System.out.println("Please enter a 1 and the computer will count ten >> ");
		response = input.nextInt();
		
		while(response == 1)
		{
			System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
			System.out.println("Would you like to do that again? 1 for yes and 2 for a for loop >> ");
			response = input.nextInt();
		}
		System.out.println("Goodbye");
	
		for (int i=0; i <= 10; ++i)
		{
			System.out.println(i + "");
		}
	
		int z=0;
		
		
		
		do
		{
			
			System.out.println(z + "");
			++z;
		}while(z !=11);
	
	
	
	
	}

}
