//22.Write a program on method Overloading and consturctor overloading

package constructorConcept;

public class Manish 
{
	static void add()
	{
		System.out.println("Addition1");
	}

	static void add(int a, int b)
	{
		System.out.println("Addition2");
		System.out.println(a+ " " +b);
	}
	static void add(String a, String b)
	{
		System.out.println("Addition3");
		System.out.println(a+ " " +b);
	}
     void sub()
       {
    	 System.out.println("Subtraction1");
	
        }
	
     void sub(int a, int b)
     {
  	 System.out.println("Subtraction2");
  	 System.out.println(a-b);
	
      }
     void sub(String a, String b)
     {
  	 System.out.println("Subtraction3");
  	 System.out.println(a+ " " +b);
	
      }
     
     
     Manish()
     {
    	 System.out.println("1st Constructor");
     }
     
     Manish(int a, int b)
     {
    	 System.out.println("2nd Constructor");
    	 System.out.println(a+b);
     }
     
     Manish(String a, String b)
     {
    	 System.out.println("3rd Constructor");
    	 System.out.println(a+ " " +b);
     }
	public static void main(String[] args) 
	{
		add();
		add(10,20);
		add("Rama", "Sita");
		Manish n1=new Manish();
		n1.sub();
		n1.sub(40, 20);
		n1.sub("Joe", "Rose");
		new Manish();
		new Manish(10,20);
		new Manish("Rita", "Geetha");
		
		
		
		
		
	}
}
