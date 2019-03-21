//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (Math.pow(10, count) < number)
		{
			count++;
		}
		return (int)count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int length=getNumDigits(number);
		int[] sorted = new int[length];
		for (int i=0; i<length; i++)
		{
			sorted[i]=(number/(int)Math.pow(10, i)%10);
		}
		for (int i=1; i<length; i++)
		{
			int temp=sorted[i];
			int checker=i;
			while (checker>0 && sorted[checker-1]>temp)
			{
				sorted[checker]=sorted[checker-1];
				checker--;
			}
			sorted[checker]=temp;
		}
		return sorted;
	}
}