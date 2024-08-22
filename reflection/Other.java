package reflection;
import java.lang.reflect.*;
//wap to display properties of a class 

public class Other {

     static final int code=100;
     
     static  void show(int a) {}
     
	public static void main(String a[]) throws Exception
	{
	//Class <?>  c = Class.forName("java.lang.String");
	
	Class <?>  c = String.class;
	
	 
	  System.out.println(c.getName());
	  System.out.println(c.getPackage());
 
	 
	 
	
	}}