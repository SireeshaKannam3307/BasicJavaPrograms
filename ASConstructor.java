//120.WAP on using Access Specifiers withinthe Class by using Constructors.

package accessspecifier;

public class ASConstructor 
{
	
	public ASConstructor()
	{
		System.out.println("Method1");
	}
	protected ASConstructor(int a, int b)
	{
		System.out.println("Method2  " + a +" "  + b);
	}
	
	ASConstructor(String name)
	{
		System.out.println("Method3  " + " " + name );
	}
	
	private ASConstructor(int a)
	{
		System.out.println("Method4  " + " " + a );
		
	}
	public static void main(String[] args) 
	{
		
		new ASConstructor();
		new ASConstructor(10,20);
		new ASConstructor("Manish");
		new ASConstructor(10);
	}

}
