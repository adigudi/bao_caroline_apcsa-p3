//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print( )
	{
		String triangle=word+"\n";
		for (int i=word.length()-1; i>0; i-=1) {
			triangle=triangle+word.substring(0, i)+"\n";
		}
		
		System.out.print(triangle);
	}
}