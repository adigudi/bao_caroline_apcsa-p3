//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", '\0');
		//call set
	}
	
	public LetterRemover (String s, char rem)
	{
		setRemover(s, rem);
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int counter=0;
		while (sentence.indexOf(lookFor)>=0) {
			if (sentence.charAt(counter)==lookFor) {
				sentence = sentence.substring(0, counter)+sentence.substring(counter+1);
				}
			else {
				counter += 1;
			}
		}
		String cleaned=sentence;
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}