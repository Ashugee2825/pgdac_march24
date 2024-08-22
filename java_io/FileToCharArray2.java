package java_io;
//wap to read a file and store its data to character array 
import java.io.*;

public class FileToCharArray2 {

	public static void main(String[] args) throws Exception  
	{
 //line 11 open file for reading 
		
		FileReader r= new FileReader("one.txt");
		
		//line 14 File class has various method to access file properties 
		File m= new File("one.txt");
		//length method returns long so we have type casted it to int 
		int y= (int)m.length();
		//here we are creating a char array of y' size
		char k[]= new char[y];
		
		//line 21 will read data from file and store it in char array 'k'
		r.read(k);
		System.out.println(k);
		
		


	}

}
