/**
 * 
 */
package com.hawkeye;

/**
 * @author smakol
 *
 */
public class ConsoleDisplay
{
	 
	/**
	 * @param args
	 */
	public static void main(String [ ] args)
	{
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println((i + 1) + ". Testing");
		}
		
		System.out.println("Name : " + JDBCConstants.JdbcSinkMode.INSERT);
		System.out.println("ID : " + JDBCConstants.JdbcSinkMode.INSERT.getID());
		
	}
	
}
