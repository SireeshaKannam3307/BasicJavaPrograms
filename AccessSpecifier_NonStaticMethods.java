//119.WAP on using Access Specifiers within the Class by using  non static methods.

package accessspecifier;

public class AccessSpecifier_NonStaticMethods 
{
	public void method1()
	{
		System.out.println("Method1");
	}
	protected void method2()
	{
		System.out.println("Method2");
	}
	void method3()
	{
		
		System.out.println("Method3");
	}
	private void method4()
	{
		System.out.println("Method4");
	}

	public static void main(String[] args) 
	{
		AccessSpecifier_NonStaticMethods n1=new AccessSpecifier_NonStaticMethods();
		n1.method1();
		n1.method2();
		n1.method3();
		n1.method4();
	}
}
