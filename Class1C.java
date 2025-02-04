package accessspecifier;

public class Class1C 
{
	public Class1C()
	{
		System.out.println("Method1");
	}
	protected Class1C(int a)
	{
		System.out.println("Method2" + " " +a);
	}
	
	Class1C(String name)
	{
		System.out.println("Method3" + " " +name);
	}
	
	private Class1C(int a, int b)
	{
		System.out.println("Method2" + " " +a +" " +b);
	}
	public static void main(String[] args) 
	{
		
	}
}
