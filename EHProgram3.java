package exceptionhandlingPrograms;

public class EHProgram3 
{

	public static void main(String[] args) 
	{
	
		try {
			
       int rollno[]=new int[3];
		rollno[0]=10;
		rollno[1]=20;
		rollno[2]=40;
		rollno[3]=60;
		}
		catch(ArrayIndexOutOfBoundsException a) 
		{
			 System.out.println("Logic");
		}
		}
		
		
	}

