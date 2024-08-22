package exceptionhandling;
//wap to ask two number from user and divide them 
import java.util.*;

public class ExceptionExample1 {

	public static void main(String[] args) {
	try { 
   int a;
   int b;
   int c;
Scanner s= new Scanner(System.in);
System.out.println("enter number ");
a= s.nextInt();
System.out.println("enter number ");
b= s.nextInt();		
c= a/b;
System.out.println("Result "+ c);

}
	catch(ArithmeticException t)
	{
		System.out.println(t.getMessage());
	}
	
	System.out.println(" end of program ");
 }

}
