package construct_inheritance;

import java.util.Scanner;

public class Person1
{
	String name;
	int age;
	void getdata()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter name and age");
		name= s.next();
		age=s.nextInt();
	}
	void display()
	{
		System.out.println(name +" "+ age);
	}
}

