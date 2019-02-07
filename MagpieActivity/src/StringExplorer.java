/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		int pos = sample.indexOf("slow");
		if (pos!=-1) {
			System.out.println("slow is found at position "+pos);
		}
		else
			System.out.println("slow is not found");
		
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		int counter=0;
		int i = 0;
		String sentence = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
		while (i<sentence.length()-3) {
			if (sentence.substring(i+1).indexOf("the")>=0){
				counter+=1;
				i=sentence.substring(i+1).indexOf("the")+i+1;
			}
			else {
				i=sentence.length();
			}
		}
		System.out.println("The number of times the word \"the\" occurs in the sentence is "+counter+".");
		//  Try other methods here:

	}

}
