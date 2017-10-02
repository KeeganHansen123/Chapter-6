package exercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) 
	{
		
		int [] scores = new int [10];
		Scanner input = new Scanner(System.in);
		int testScore = 0;
		int quit = 999;
		int highest = 0;
		int lowest = 998;
		int count = 0;
		int total = 0;
		int max = 0;
		
		
		System.out.println("Please enter the test score (Enter 999 to stop program)");	
		
		do
		{
		scores[count] = testScore;
		total += scores[count];
		++count;
		System.out.println("Enter score: ");
		testScore = input.nextInt();
		
		if(count == max)
			testScore = quit;
		else
			if(highest <= testScore)
				highest = testScore;
			if(lowest >= testScore)
				lowest = testScore;
		
		}while(testScore != quit);
		
		
		
		if(count != 0)
			System.out.println("The average was " + (total * 1)/count);
		
		System.out.println("The highest is: " + highest);
		System.out.println("The lowest is: " + lowest);
		
	}

}
