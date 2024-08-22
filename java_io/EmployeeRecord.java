package java_io;
//wap to ask name ,age and salary of a employee and store it to file
//Serialization  --writeObject  | deserialization  --> readObject 
//mechanism to convert object to bytestream or vice versa
// ObjectOutputStream  |ObjectInputStream
//class must inherit serilizable interface 
//serilaizable is marker interface  ie. empty interface 
import java.io.*;
import java.util.Scanner;

class Employee implements Serializable 
{
	String name;
	int age;
	int salary;
	void input()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter name");
		name=s.next();
		System.out.println("enter age");
		age=s.nextInt();
		System.out.println("enter salary");
		salary=s.nextInt();
				
	}
	void display()
	{
		System.out.println(name +"  "+ age +"  "+ salary);
	}
}
public class EmployeeRecord {

	public static void main(String[] args) {
   try 
   {
    Employee r= new Employee();
    ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream("emp.dat"));
    r.input();
    os.writeObject(r);
    os.close();
    
    ObjectInputStream is= new ObjectInputStream(new FileInputStream("emp.dat"));
    r=(Employee) is.readObject();
    
    
    r.display();
}catch(Exception ww) {}
	}

}
