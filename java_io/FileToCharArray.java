package java_io;
//wap to read a file and store its data to character array 
import java.io.FileReader;

public class FileToCharArray {

	public static void main(String[] args) throws Exception  
	{

		FileReader r= new FileReader("one.txt");
		
		char k[]= new char[291];
		
		r.read(k);
		System.out.println(k);
		
		


	}

}
