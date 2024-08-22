package exceptionhandling;


public class FinallyExample2 {

	public static void main(String[] args) {

try {
	int y=10/0;
   }
catch(Exception e)
{
	System.out.println(e);
}
	finally 
	{
		System.out.println("bye");
	}
	System.out.println("*******");	
	}

}
