//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test1 = new LetterRemover("I am Sam I am", 'a');
		System.out.print(test1);
		System.out.println(test1.removeLetters());
		LetterRemover test2 = new LetterRemover("ssssssssxssssesssssesss", 's');
		System.out.print(test2);
		System.out.println(test2.removeLetters());
		LetterRemover test3 = new LetterRemover("qwertyqwertyqwerty", 'a');
		System.out.print(test3);
		System.out.println(test3.removeLetters());
											
	}
}