import java.util.*;
class prog28
{
	public static String toggleString(String sentence) 
	{
		StringBuilder toggled = new StringBuilder(sentence.length());
		for (char letter : sentence.toCharArray()) 
		{
			if(Character.isUpperCase(letter)) 
			{
				letter = Character.toLowerCase(letter);
			} 
			else if(Character.isLowerCase(letter)) 
			{
				letter = Character.toUpperCase(letter);
			}
			toggled.append(letter);
		}
		return toggled.toString();
	}
	public static void main(String args[])
	{
		String x;
		System.out.println("enter a string: ");
		Scanner s = new Scanner(System.in);
		x=s.nextLine();
		System.out.println("old : "+x);
		x=toggleString(x);
		System.out.println("new : "+x);
	}
}

