//129.WAP for Thread.sleep using for loop by using try and catch
package exceptionhandlingPrograms;

public class Thread_sleep_try_catch 
{
	public static void main(String[] args) 
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println("Manish");
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
