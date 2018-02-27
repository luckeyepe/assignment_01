package assignment_01;

import ignore.TestingUtils;

public class App {
	
	/**
	Given a string of odd length, return the middle 3 characters from the string, 
	so the string <b>"Monitor"</b> yields <b>"nit"</b>. 
	If the string length is less than 3, return the string as is. <br> <br>

	<b>EXPECTATIONS:</b><br>
	middleThree("bunny") <b>---></b> "unn" <br>
	middleThree("peter") <b>---></b> "ete" <br>
	middleThree("Jamaica") <b>---></b>"mai" <br>
	 */
	public static boolean isOddLenght(String input)
	{
		return (input.length()%2 != 0);
	}
	
	public static int findMiddleIndex(String input)
	{
		return (input.length()/2);
	}
	
	public static boolean isStringLengthLessThanThree(String input)
	{
		return (input.length()<3);
	}
	
	public static String middleThree(String input)
	{
		int middleIndex;
		String result = "";
		
		if(isOddLenght(input) && !isStringLengthLessThanThree(input))
		{
			middleIndex = findMiddleIndex(input);
			
			for(int i = middleIndex-1; i<=middleIndex+1; i++)
			{
				result+=input.charAt(i);
			}
			
			return result;
		}
		else
		{
			return input;
		}

	}
	
	
//----------------------STARTING POINT OF PROGRAM. IGNORE BELOW --------------------//
	public static void main(String args[])
	{
		String input = "bunny";
		
		middleThree(input);
		TestingUtils.runTests();
	}
}
