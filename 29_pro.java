import java.util.*;
class prog29 
{
	public static void main(String[] args) 
	{
		String targetString = "Java is OOP language.  Java is fast, secure, and reliable.";
		String s1= "JAVA";
		String s2= "Java";
		String s3 = "  Hello Java  ";

		System.out.println("Length: "+ targetString.length());
		System.out.println("lower case: "+ targetString.toLowerCase());
		System.out.println("upper case: "+ targetString.toUpperCase());
		System.out.println("Trim : " + s3.trim());
		System.out.println("Char at index 2: " + targetString.charAt(2));
		System.out.println("After Concat: "+ targetString.concat(" Let's Study Java "));
		
		System.out.println("equals: " +s2.equals(s1));
		System.out.println("equals ignore case: " +s2.equalsIgnoreCase(s1));		
		
		System.out.println("SubString: "+ targetString.substring(7));
		System.out.println("SubString: "+ targetString.substring(5, 7));
		
		System.out.println("Replace function: "+ targetString.replace("OOP", "Object Oriented Programming"));
		
		System.out.println("searching s1 : " + targetString.contains(s1));
		System.out.println("searching s2 : " + targetString.contains(s2));

		char [] charArray = s2.toCharArray();
	
System.out.println("Size of char array: " + charArray.length);	
	}
}
