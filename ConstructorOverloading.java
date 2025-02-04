//Write a program on the Constructor overloading

package constructorConcept;

public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
		System.out.println("1st Constructor");
		
	}

	ConstructorOverloading(int a, int b)
	{
		System.out.println("2nd Constructor");
		System.out.println(a+ " " +b);
	}
	ConstructorOverloading(String a, String b)
	{
		System.out.println("3rd Constructor");
		System.out.println(a+ " " +b);
	}

	ConstructorOverloading(int a, String b)
	{
		System.out.println("4th Constructor");
		System.out.println(a+ " " +b);
	}

	public static void main(String[] args) 
	{
		new ConstructorOverloading();
		new ConstructorOverloading(10,10);
		new ConstructorOverloading("Joe", "Sita");
		new ConstructorOverloading(30,"Rama");
		
		
	}
}
