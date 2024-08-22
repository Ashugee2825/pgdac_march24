package reflection;
import java.lang.reflect.*;
//wap to display properties of a class 

public class MethodsExample2 {

     static final int code=100;
     
     static  void show(int a) {}
     
	public static void main(String a[]) throws Exception
	{
	//Class <?>  c = Class.forName("java.lang.String");
	
	Class <?>  c = MethodsExample2.class;
	
	Method v[]= c.getDeclaredMethods();
	
	for(int i=0;i<v.length;i++)
	{	System.out.println(i+1+"  "+v[i]);
	
	  System.out.println(v[i].getModifiers());
	  //default =0 
	  //public = 1
	  //private =2 
	  //protected =4 
	  //static = 8
	  System.out.println(v[i].getReturnType());
	}
	
	
	}}