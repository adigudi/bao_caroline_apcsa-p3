//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

   public Perfect() {
	   number=0;
   }
   
   public Perfect(int num) {
	   setnumber(num);
   }
   
   public void setnumber(int num) {
	   number=num;
   }

	public boolean isPerfect()
	{	
		int test = 0;
		for (int i=1; i<number; i++) {
			if (number%i==0) {
				test+=i;
			}
		}
		if (test==number) {
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		if (isPerfect()) {
			return number + " is perfect.";
		}
		return number+" is not perfect.";
	}

	//add a toString	
	
}