package exceptionhandling;

public class MixExample {

	public static void main(String[] args) {
     try
     {
     int a[]= new int [5];
     int b=10/0;
     a[6]=44;
     }
     
     catch(ArithmeticException e)
     {
    	 System.out.println("divide by zero");
     }
     catch(ArrayIndexOutOfBoundsException e)
     {
    	 System.out.println("array problem ");
     }
     //exception must be written in last 
     catch(Exception e)
     {
    	 System.out.println("other exception");
      }
     
     
	System.out.println("out of try");	
	}

}
