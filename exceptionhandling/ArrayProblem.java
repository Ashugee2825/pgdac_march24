package exceptionhandling;
//by doing exception handling we prevent program from abnormal termination 
//and give userfriendly action or message 
public class ArrayProblem {

	public static void main(String[] args) {

		try
		{
		int a[]= new int[5];
		a[5]=33;
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException r)
		{
			System.out.println("plz check array size" +r.getMessage());
		}
		System.out.println("end of program ");
	}

}
