//118.WAP on using Access Specifiers withinthe Class by using static methods.

package accessspecifier;

public class AccessSpecifier_StaticMethods 
{
	public static void method1()
	{
		System.out.println("Method1");
	}
	
	protected static void method2()
	{
		System.out.println("Method2");
	}
	
	static void method3()
	{
		System.out.println("Method3");
	}
	private static void method4()
	{
		System.out.println("Method4");
	}
	public static void main(String[] args) 
	{
		method1();
		method2();
		method3();
		method4();
		
	}

}
