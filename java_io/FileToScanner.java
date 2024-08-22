package java_io;
import java.util.*;
import java.io.*;
public class FileToScanner {

	public static void main(String[] args) throws Exception{
 try {
		Scanner s= new Scanner(new FileInputStream ("one.txt"));
		
		String r;
		
		do
		{
			r= s.next();
			if(r!=null)
			 System.out.print(" "+ r);
			
		}
		while(r!=null);
		
    }catch(Exception o) {}	
	}

}
