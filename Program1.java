package constructorConcept;

public class Program1 
{
	public Program1() 
	{
		System.out.println("Addition");
	}
	
public Program1(int a, int b) 
{
	System.out.println("Addition1");
	System.out.println(a+b);
	}


public Program1(String a,int b) 
{
	System.out.println("Addition3");
		System.out.println(a+ " " +b);
	}


public Program1(boolean a, String b) 
{
	System.out.println("Addition3");
	System.out.println(a+ " " +b);
	}
public static void main(String[] args) 
{
	new Program1();
	new Program1(10,10);
	new Program1("Manish", 10);
	new Program1(true,"Sahi");
}
}
