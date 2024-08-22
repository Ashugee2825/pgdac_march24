package reflection;
import java.lang.reflect.*;
//wap to display properties of a class 

public class Trial {

     static final int code=100;
	public static void main(String a[]) throws Exception
	{
	Class <?>  c = Class.forName("java.lang.String");
	
	Field v[]= c.getFields();
	
	for(int i=0;i<v.length;i++)
	{	System.out.println(i+1+ " "+v[i]);
	}
	
	
	}}