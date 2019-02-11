//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		
		double compNum = 3*Math.random();
		if ((int)compNum==0) {
			compChoice = "R";
		}
		else if ((int)compNum == 1) {
			compChoice = "P";
		}
		else {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		if (playChoice.contentEquals(compChoice)) {
			winner = "!Draw Game!";
		}
		else if (playChoice.equals("R")) {
			if (compChoice.contentEquals("P")) {
				winner = "!Computer wins <<Paper Covers Rock>>!";
			}
			else {
				winner = "!Player wins <<Rock Breaks Scissors>>!";
			}
		}
		else if (playChoice.equals("P")) {
			if (compChoice.contentEquals("R")) {
				winner = "!Player wins <<Paper Covers Rock>>!";
			}
			else {
				winner = "!Computer wins <<Scissors Cuts Paper>>!";
			}
		}
		else if (playChoice.equals("S")) {
			if (compChoice.contentEquals("P")) {
				winner = "!Player wins <<Scissors Cuts Paper>>!";
			}
			else {
				winner = "!Computer wins <<Rock Breaks Scissors>>!";
			}
		}
		return winner;
	}

	public String toString()
	{
		String output="player had "+playChoice + "\ncomputer had "+compChoice+ "\n"+ determineWinner();
		return output;
	}
}