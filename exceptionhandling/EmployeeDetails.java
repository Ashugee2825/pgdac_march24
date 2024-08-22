package exceptionhandling;

import java.util.Scanner;
//example for unchecked exception 
//as program is raising unchecked exception so even without try catch 
//or throws program will compile without error
//in case if user enter wrong password then program will terminate 
public class EmployeeDetails {

	String name;
	String pass;
	void sum()throws Exception
	{
		throw new Exception();
	}
	
	void getData()
	{//try {
		Scanner s= new Scanner(System.in);
		System.out.println("enter name and password");
		name=s.next();
		pass= s.next();
		if(pass.equals("admin"))
			System.out.println("welcome user ");
		else
			throw new PasswordCheckException();
	//}catch(PasswordCheckException r)	{}
		
	}
	void display()
	{
		System.out.println(name +"  "+ pass);
	}
	public static void main(String[] args) {
		 
		EmployeeDetails d= new EmployeeDetails();
	    d.getData();
	    d.display();

	}

}
