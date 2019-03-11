
public class Zombie implements Monster
{
	private String name;
	private int size;
	
	public Zombie() 
	{
		setVars("", 0);
	}
	
	public Zombie(String word, int num)
	{
		setVars(word, num);
	}
	
	public void setVars(String word, int num)
	{
		name=word;
		size=num;
	}
	
	public int getHowBig()
	{
		return size;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isBigger(Monster other)
	{
		if (size>other.getHowBig())
		{
			return true;
		}
		return false;
	}
	
	public boolean isSmaller(Monster other)
	{
		if (size<other.getHowBig())
		{
			return true;
		}
		return false;
		
	}
	
	public boolean namesTheSame(Monster other)
	{
		if (name.equals(other.getName()))
		{
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		return name+ " " + size;
	}
}
