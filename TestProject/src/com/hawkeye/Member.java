package com.hawkeye;

import java.util.List;

public class Member
{
	String name;
	String email;
	List<Member> friends;
	
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}
	
	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	/**
	 * @return the friends
	 */
	public List<Member> getFriends()
	{
		return friends;
	}
	
	/**
	 * @param friends
	 *            the friends to set
	 */
	public void setFriends(List<Member> friends)
	{
		this.friends = friends;
	}
	
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
