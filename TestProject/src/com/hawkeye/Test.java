package com.hawkeye;

import java.util.Random;

public class Test
{
	
	/**
	 * @param args
	 */
	public static void main(String [ ] args)
	{
		String randomString = null;
		
		for (int i = 0; i < 10; i++)
		{
			randomString = getRandomString(30);
			System.out.println("Value of randomString: " + randomString);
			passwordStrength(randomString);
		}
		
	}
	
	public static String getRandomString(int length)
	{
		final String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+";
		StringBuilder result = new StringBuilder();
		while (length > 0)
		{
			Random rand = new Random();
			result.append(characters.charAt(rand.nextInt(characters.length())));
			length--;
		}
		return result.toString();
	}
	
	public static void passwordStrength(String password)
	{
		int len = password.length();
		int digit = 0;
		int lowerCase = 0;
		int upperCase = 0;
		int count = 0;
		Character character = null;
		if (len >= 7)
		{
			while (count < len)
			{
				character = password.charAt(count);
				if (Character.isDigit(character))
				{
					digit = digit + 1;
				}
				if (Character.isLowerCase(character))
				{
					lowerCase = lowerCase + 1;
				}
				if (Character.isUpperCase(character))
				{
					upperCase = upperCase + 1;
				}
				count = count + 1;
			}
		}
		
		if (digit >= 5 && lowerCase >= 5 && upperCase >= 5)
		{
			System.out.println("Acceptable Password.");
		}
		else
		{
			System.out.println("Unacceptable Password.");
		}
	}
	
}
