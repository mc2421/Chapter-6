package GameZone;

import javax.swing.JOptionPane;

public class RandomGuessLoop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int guess;
		int result;
		String resultString;
		String msg;
		
		int low = 1;
		int high = 100;
		int score = 10;
		
		result = low +(int)(Math.random() * high);
	do {
		resultString = JOptionPane.showInputDialog(null, "Try to guess my number between" + low + " and " + high);
		guess = Integer.parseInt(resultString);
		score--;
		
		if(guess == result)
		{
			msg = "You Win!!!";
		}
		
		else
			if(guess<result)
			{
				msg = "Your guess was Too Low";
			
			}
			else 
				msg = "Your guess was too High";
				
		JOptionPane.showMessageDialog(null,  msg + "Your Score was " + score);
	//JOptionPane.shpwInputDialog(null, "Would you like to try again?");
	}while(guess != result); 
	while(score == 0);
	JOptionPane.showMessageDialog(null, msg + "You score is " + score);
	
	{
	}
	}
}
		
	


