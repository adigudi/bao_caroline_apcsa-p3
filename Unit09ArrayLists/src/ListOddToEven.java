//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		for (int i=0; i<ray.size(); i++) {
			if (ray.get(i)%2==1) {
				int finalEven=0;
				for (int j=i; j<ray.size(); j++) {
					if (ray.get(j)%2==0) {
						finalEven=j;
					}
				}
				if (finalEven>0) {
					return finalEven-i;
				}
			}
		}
		return -1;
	}
}