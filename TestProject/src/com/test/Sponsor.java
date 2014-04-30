package com.test;

import java.util.Collection;
import java.util.List;

public class Sponsor implements Member
{ 
	String name;
	String email;
	List<Sponsor> sponsor;
	Double rewardAmount;
	Double sponsorRewardAmount;
	Integer sponsorDepth;

	/**
	 * @return the sponsorRewardAmount
	 */
	public Double getSponsorRewardAmount()
	{
		return sponsorRewardAmount;
	}

	/**
	 * @param sponsorRewardAmount the sponsorRewardAmount to set
	 */
	public void setSponsorRewardAmount(Double sponsorRewardAmount)
	{
		this.sponsorRewardAmount = sponsorRewardAmount;
	}

	/**
	 * @return the rewardAmount
	 */
	public Double getRewardAmount()
	{
		return rewardAmount;
	}

	/**
	 * @param rewardAmount the rewardAmount to set
	 */
	public void setRewardAmount(Double rewardAmount)
	{
		this.rewardAmount = rewardAmount;
	}

	
	
	/**
	 * @return the sponsorDepth
	 */
	public Integer getSponsorDepth()
	{
		return sponsorDepth;
	}

	/**
	 * @param sponsorDepth the sponsorDepth to set
	 */
	public void setSponsorDepth(Integer sponsorDepth)
	{
		this.sponsorDepth = sponsorDepth;
	}

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
	 * @return the sponsor
	 */
	public List<Sponsor> getSponsor()
	{
		return sponsor;
	}
	
	/**
	 * @param sponsor
	 *            the sponsor to set
	 */
	public void setSponsor(List<Sponsor> sponsor)
	{
		this.sponsor = sponsor;
	}

	@Override
	public double getMonthlyAmazonDollars()
	{
		Double rewardAmount = (10* this.rewardAmount)/100;
		
		Double sponsorRewardAmount = 0.0;
		
		if(this.sponsor != null)
		{
			for (int i = 0; i < this.sponsor.size(); i++)
			{
				sponsorRewardAmount = sponsorRewardAmount + (4* this.sponsor.get(i).getRewardAmount())/100;
			}
		}
		return (rewardAmount + sponsorRewardAmount);
	}

	@Override
	public Collection<Member> getRecruitedMembers()
	{
		// TODO Auto-generated method stub
		return null;
	}
}
