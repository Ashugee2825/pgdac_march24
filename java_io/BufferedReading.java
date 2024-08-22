package java_io;
//wap to ask name age and salary of a person and display it 
import java.io.*;
//parsing - wrapper class 
public class BufferedReading {

	public static void main(String[] args)throws IOException  {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter name age salary");
		String name= br.readLine();
		
		int age    = Integer.parseInt(br.readLine());
		
		float salary=Float.parseFloat(br.readLine());
		
		System.out.println("name"+name);
		System.out.println("age"+age);
		System.out.println("salary"+salary);
		
		
	}

}
