package gameZone;

import javax.swing.JOptionPane;

public class RandomGuessLoop {

	public static void main(String[] args) 
	{
		int guess;
		int result;
		String resultString;
		String message;
		int low = 1;
		int high = 100;
		int score = 0;
		
		result = low + (int)(Math.random() * high);
		
		do {
		resultString = JOptionPane.showInputDialog(null, "Try to guess my number between " + low + " and " + high);
		guess = Integer.parseInt(resultString);
		score++;
		if(guess == result)
		{
			message = "You win!!!";
		}
		else
			if(guess<result)
			{
				message = "To Low";
				
			}
			else
				message = "To High";
				
		JOptionPane.showMessageDialog(null, message + ". That was " + score + " attempt(s).");
		
		}while(guess != result || score == 0);	
	}
}
