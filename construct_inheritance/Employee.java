package construct_inheritance;

import java.util.Scanner;

import day3_array_objects.Person;


public class Employee extends Person
{
Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
int empid;
String designation;
void input()
{
	getdata();
	Scanner s= new Scanner(System.in);
	System.out.println("enter empid and designation");
	empid = s.nextInt();
	designation= s.next();
}

private void getdata() {
	// TODO Auto-generated method stub
	
}

void show()
{
	display();
	System.out.print("  "+empid +"  "+ designation );
}
	public static void main(String[] args) {
		 Employee e = new Employee();
		 e.input();
		 e.show();

	}

}
