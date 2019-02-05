//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
		String vowels = "aeiouAEIOU";
		
		if (vowels.indexOf(a.substring(0, 1))>=0 || vowels.indexOf(a.substring(a.length()-1, a.length()))>=0) {
			return "yes";
		}
		else {
			return "no";
		}
	}
}