//118.Wap on StringBuffer using its methods append,delete,
//insert,reverse,substring,length,charAt, etc
package stringbufferPrograms;

public class StringBufferProgram {

	public static void main(String[] args) 
	{
		StringBuffer n1=new StringBuffer("Healthcare");
		n1.append("Domain");
		System.out.println(n1);
		System.out.println(n1.charAt(12));
		System.out.println(n1.indexOf("D"));
		System.out.println(n1.delete(10, 18));
		System.out.println(n1.insert(6, "Domain"));
		System.out.println(n1);
		System.out.println(n1.substring(6));
	   System.out.println(n1.substring(6, 16));
		System.out.println(n1);
	     System.out.println(n1.length());
	     System.out.println(n1.charAt(4));
	     System.out.println(n1 );
	     System.out.println(n1.reverse());
}

}
