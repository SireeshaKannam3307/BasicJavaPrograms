package exceptionhandlingPrograms;

public class EHPrograma1 {

	public static void main(String[] args) 
	{
		try 
		{
			int b=1/0;	
		 }
		
		catch(ArithmeticException b)
		{
           System.out.println("Handled the Exception");
			
		}
		
	}

}

