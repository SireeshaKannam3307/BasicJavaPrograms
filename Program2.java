//135.WAP for Run time Polymorphism
//MethodOverriding for non static methods
//Creating an object for Program2
package polymorphism;

class Program3
{
	void StudentDetails()
	{
		System.out.println("StudentDetails one");
	}
}
public class Program2 extends Program3
{
	void StudentDetails()
	{
		System.out.println("StudentDetails two");
	}
	
	public static void main(String[] args) 
	{
		Program2 n1=new Program2();
		n1.StudentDetails();
		
		
		
	}

}
