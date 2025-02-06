//135.WAP for Run time Polymorphism
//MethodOverriding for non static methods
//Creating an object for Program5

package polymorphism;

class Program5
{
	void Addition()
	{
		System.out.println("Addition of 2 numbers");
	}
	
}
public class Program4 extends Program5
{
        void Addition()
        {
        	System.out.println("Addition of 3 numbers");
        }
	public static void main(String[] args) 
	{
	    Program5 n1=new Program5();
	    n1.Addition();
	}
}
