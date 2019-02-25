import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> test = new ArrayList<Integer>(); 
		test.add(-99);
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.add(5);
		System.out.println(ListDown.go(test));
		test.clear();
		test.add(10);
		test.add(0);
		test.add(-1);
		System.out.println(ListDown.go(test));
	}
}