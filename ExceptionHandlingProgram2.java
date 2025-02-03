package exceptionhandlingPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingProgram2 
{

	public static void main(String[] args) 
	{
	   try 
	   {
		    Scanner s1=new Scanner(System.in);
		   System.out.println("Enter the size of your Array");
		   int rollno[]=new int[s1.nextInt()];
	   }
	   catch(NegativeArraySizeException n){
		   Scanner s1=new Scanner(System.in);
		   System.out.println("Enter the size of your Array as Positive number only");
		   int rollno[]=new int[s1.nextInt()];
	   }
	   catch(InputMismatchException n1){
		   Scanner s1=new Scanner(System.in);
		   System.out.println("Please enter only Integer values starting from 1");
		   int rollno[]=new int[s1.nextInt()];
	   }
	   
	   
	   }
	   
	   
		
}



	  
		

