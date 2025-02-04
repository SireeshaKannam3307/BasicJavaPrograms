//122.WAP on using Access Specifiers  outside the package 
//without becoming subclass for  static methods

package accessspecifier;

import accessspecifier1.Assignment122b;

public class Assignment122a 
{
	public static void Login1()
	{
		System.out.println("Public Login1 Details");
	}

	protected static void Login2()
	{
		System.out.println("Protected Login2 Details");
	}
	 static void Login3()
	{
		System.out.println("default Login3 Details");
	}
	private static void Login4()
	{
		System.out.println("Private Login4 Details");
	}
	public static void main(String[] args) 
	{
		Assignment122b.Logout1();
	}
}
