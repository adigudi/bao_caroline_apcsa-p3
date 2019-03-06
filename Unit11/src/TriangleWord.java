//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		String output = "";
		for (int rows=1; rows<=word.length(); rows++) {
			for (int line = 0; line<rows; line++) {
				output+=word.substring(0, rows);
			}
			output+="\n";
		}
		System.out.print(output+"\n");
	}
}