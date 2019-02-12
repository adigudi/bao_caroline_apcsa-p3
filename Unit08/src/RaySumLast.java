//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		boolean numinarray=false;
		if (ray.length==0) {
			return -1;
		}
		for (int i=0; i<ray.length; i+=1) {
			if (ray[i]>ray[ray.length-1]) {
				numinarray=true;
				sum+=ray[i];
			}
		}
		if (numinarray==true) {
			return sum;
		}
		else {
			return -1;
		}
	}
}