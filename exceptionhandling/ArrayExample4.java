package exceptionhandling;
//what will be the output if we run below code 
//a) java ArrayExample3  welcome hello java 

public class ArrayExample4  
{

	public static void main(String[] args) {

		for(String h:args)
		{
			System.out.println(h.charAt(5));//StringIndexOutOfBoundsException
		}
		
       System.out.println("end of program ");
		
		
	}

}
