import java.util.Arrays;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		System.out.println(ListOddToEven.go(Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11)));
		System.out.println(ListOddToEven.go(Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7)));
		System.out.println(ListOddToEven.go(Arrays.asList(10,20,30,40,5,41,31,20,11,7)));
	}
}