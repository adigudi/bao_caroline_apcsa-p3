//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid test = new Grid(3, 3, new String[] {"a", "b", "c"});
		System.out.println(test);
		System.out.println(test.findMax(new String[] {"a", "b", "c"}));
		
		Grid test1 = new Grid(6, 6, new String[] {"a", "b", "c", "d", "e", "f"});
		System.out.println(test1);
		System.out.println(test1.findMax(new String[] {"a", "b", "c", "d", "e", "f"}));
	}
}