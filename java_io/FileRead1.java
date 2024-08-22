package java_io;
//wap to read content of file and display it on screen
import java.io.*;

public class FileRead1 {

	public static void main(String[] args) {
try {
	// FileReader and FileInputSteam both have read method 
	//that return numeric value 
	     FileReader f= new FileReader("one.txt");
		//FileInputStream f= new FileInputStream("one.txt");
		int i;
		do
		{
			//read file content one by one and store it in i variable 
			i=f.read();
			System.out.print((char) i);//print after typecasting
			
		}
		while(i!=-1);//-1 is eof here
}catch(Exception r)
{
	System.out.println(r);
}
	}

}
