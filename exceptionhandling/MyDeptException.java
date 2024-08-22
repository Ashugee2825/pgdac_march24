package exceptionhandling;
//demonstrate Userdefined or custom exception
//when a class inherit Exception then it become checked exception
public class MyDeptException extends Exception 
{
	String msg;
	public MyDeptException()
	{
		System.out.println("plz check dept number ");
	}
	public MyDeptException(String m)
	{
		msg=m;
		System.out.println(m);
	}
	public String getMesg()
	{
		return msg;
		
	}

}
