package Pgm;

import java.util.Scanner;

public class recursiveString 
{
	
	public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter the elements");
	
	String mystr=s.nextLine();
	
	 char reversed=reversestring(mystr);
	 
	 System.out.println("reversed string is "+reversed);
			
}

	public static char reversestring(String mystr )
	{
		if(mystr.isEmpty())
		{
			System.out.println("String is empty");
			
			
			
		}
		
		System.out.println("String is passed in recursive function"+mystr.substring((1)+mystr.length()/2));
		return mystr.substring((1)+mystr.length()/2).charAt(0);
	}
	
}
