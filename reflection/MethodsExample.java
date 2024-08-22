package reflection;
import java.lang.reflect.*;
//wap to display properties of a class 

public class MethodsExample {

     static final int code=100;
     
     public void show(int a) {}
     
	public static void main(String a[]) throws Exception
	{
	//Class <?>  c = Class.forName("java.lang.String");
	
	Class <?>  c = MethodsExample.class;
	
	Method v[]= c.getMethods();
	
	for(int i=0;i<v.length;i++)
	{	System.out.println(i+1+"  "+v[i]);
	
	  System.out.println(v[i].getModifiers());
	  System.out.println(v[i].getReturnType());
	}
	
	
	}}