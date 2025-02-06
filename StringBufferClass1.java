package stringbufferPrograms;

public class StringBufferClass1 
{

	public static void main(String[] args) 
	{
		//StringBuffer s1=new StringBuffer();//it will call the constructor which will assign inital capacity as 16.
		StringBuffer s1=new StringBuffer("Automation");
		s1.append(" Testing");
		System.out.println(s1);
		
		//delete method
		
		System.out.println(s1.delete(11, 18));
		//replace method
		StringBuffer s2=new StringBuffer("Manish");
		s2.append(" Tiwari");
		System.out.println(s2);
		System.out.println(s2.replace(7,13, "Rai"));
		//length
		System.out.println(s2.length());
		System.out.println(s2.substring(7));
		
		StringBuffer s3=new StringBuffer("Sireesha");
		s3.append(" Kannam");
		System.out.println(s3);
		System.out.println(s3.substring(0,8));
		
		//insert
		StringBuffer s4=new StringBuffer("Manish Kumar");
		
		System.out.println(s4.insert(6," Automation"));
		
		
		
		

	}
}
