package com.hawkeye;

import java.util.List;

public class SocialGraph
{
	
	/**
	 * @param args
	 */
	public static void main(String [ ] args)
	{
		Member member = new Member();
		printSocialGraph(member);
	}
	
	private static void printSocialGraph(Member member)
	{
		Member friend = null;	
		List<Member> friendsList = member.getFriends();
		if(friendsList == null)
		{
			System.out.println(member.getName() + " having email as " + member.getEmail() + " has no friends");
		}
		else
		{
			System.out.println(member.getName() + " having email as " + member.getEmail() + " has following friends: ");
			for (int i = 0; i < member.getFriends().size(); i++)
			{
				friend = member.getFriends().get(i);
				printSocialGraph(friend);
			}
		}
		
	}
	
}
