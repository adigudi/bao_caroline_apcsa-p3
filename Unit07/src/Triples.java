//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for (int i = 1; i<a; i+=1) {
			if (a%i==0 && b%i==0 && c%i==0) {
				max=i;
			}
		}
		return max;
	}

	public String toString()
	{
		String output="";
		for (int i = 1; i<=110; i+=1) {
			for (int j = i; j<=110; j+=1) {
				for (int k = j; k<=110; k+=1) {
					if (i*i+j*j==k*k) {
						if ((i%2==0 && j%2!=0 && k%2!=0) || (i%2!=0 && j%2==0 && k%2!=0)) {
							if (greatestCommonFactor(i, j, k)==1) {
								output=output+i+" "+j+" "+k+"\n";
							}
						}
					}
				}
			}
		}
		return output+"\n";
	}
}