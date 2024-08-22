package java_io;
//wap to read  content of file and store it to byte array
import java.io.*;

public class FileTobyteArray {

	public static void main(String[] args)throws Exception 
	{
		FileInputStream f= new FileInputStream("one.txt");
		
		File m= new File("one.txt");
		
		int y= (int)m.length();
		
		byte b[]= new byte[y];
		
		f.read(b);
		
		for(byte k:b )
		  System.out.print((char)k);

	}

}
