package exceptionhandling;

public class CheckedUnchecked {

	
	
	void show() throws ArithmeticException
	{
		throw new ArithmeticException();
	}
	
	void display(int a) throws ClassNotFoundException,Exception
	{ 
		if(a==10)  		throw  new  Exception();
		else if(a>10)    throw new ClassNotFoundException ();
 
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		 
		CheckedUnchecked c= new CheckedUnchecked();
		c.display(10);
		c.show();
	}

}
 
