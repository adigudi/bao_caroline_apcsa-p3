//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("src//words.dat"));

		int size = file.nextInt();
		Word words[]=new Word[size];
		int counter=0;
		file.nextLine();
		for (int i=0; i<size; i++)
		{
			words[counter]=new Word(file.nextLine());
			counter++;
		}
		file.close();
		
		Arrays.sort(words);
		
		for (Word word:words)
		{
			System.out.println(word);
		}

	}
}