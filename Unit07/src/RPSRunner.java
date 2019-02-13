//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		
		//add in a do while loop after you get the basics up and running
		
			String cont = "y";

			while (cont.equals("y")) {
				out.print("type in your prompt [R,P,S] :: ");
				
				String playerChoice = keyboard.next();
				//read in the player value
			
				RockPaperScissors game = new RockPaperScissors(playerChoice);		
				
				out.println(game);
				
				out.print("Do you want to play again? ");
				
				cont = keyboard.next();
			}
	}
}



