package java_io;
//wap to display file property
import java.io.*;
public class FileExample {

	public static void main(String[] args) {
		//Autoboxing and Unboxing  
		//Integer r=Integer.parseInt("10");
		//int r1=Integer.parseInt("10");
		
		//int y= Integer.parseInt("10a");//java.lang.NumberFormatException
		
		File f= new File("one.txt");
		System.out.println("length"+ f.length());
		System.out.println("getAbsolutePath"+ f.getAbsolutePath());
		System.out.println("getName"+ f.getName());
		System.out.println("getParent"+ f.getParent());
		System.out.println("lastModified"+ f.lastModified());
		System.out.println("isFile"+ f.isFile());
		System.out.println("isDirectory"+ f.isDirectory());
		System.out.println("exists"+ f.exists());
		
		File r= new File("mainfolder\\abc\\xyz");
		r.mkdirs();//to create folder 
		
	}

}
//official documentation oracle 
//which class is used to create folder
/* a File
 * b FileReader
 * C FileInputStream
 * D Both b and c
 */
 