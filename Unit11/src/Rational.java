//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	int num, den;
	
	public Rational() 
	{
		setRational(1, 1);
	}

	public Rational(int numerator, int denominator) 
	{
		setRational(numerator, denominator);
	}
	
	public void setRational(int numerator, int denominator)
	{
		setNumerator(numerator);
		setDenominator(denominator);
	}
	
	public void setNumerator(int numerator)
	{
		num=numerator;
	}
	
	public void setDenominator(int denominator)
	{
		den=denominator;
	}
	
	public void add(Rational  other)
	{
		setNumerator(num*other.getDenominator()+other.getNumerator()*den);
		setDenominator(den*other.getDenominator());
		reduce();
	}

	private void reduce()
	{
		int gcd=gcd(num, den);
		setNumerator(num/gcd);
		setDenominator(den/gcd);
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd=1;
		for (int i=1; i<=numOne; i++)
		{
			if (numOne%i==0 && numTwo%i==0) gcd=i;
		}
		return gcd;
	}

	public Object clone ()
	{
		return new Rational(num, den);
	}


	public int getNumerator()
	{
		return num;
	}
	
	public int getDenominator()
	{
		return den;
	}	
	
	public boolean equals( Rational obj)
	{
		obj.reduce();
		reduce();
		if (num*obj.getDenominator()-obj.getNumerator()*den==0)
		{
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		other.reduce();
		reduce();
		if (num*other.getDenominator()-other.getNumerator()*den > 0) {
			return 1;
		}
		else if (num*other.getDenominator()-other.getNumerator()*den <0) {
			return -1;
		}
		else return 0;
	}


	public String toString()
	{
		return num+ "/" +den;
	}
	
	//write  toString() method
	
	
}