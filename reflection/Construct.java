package reflection;
import java.lang.reflect.*;
//wap to display properties of a class 

public class Construct {

    public static final int code=100;
    public Construct(String y, int z){}
    
	public static void main(String a[]) throws Exception
	{
	//Class <?>  c = Class.forName("java.lang.String");
	Class <?>  c =  Construct.class;
	Constructor v[]= c.getConstructors();
	
	for(int i=0;i<v.length;i++)
	{	System.out.println(i+1+"  "+v[i]);
	 
	    Parameter [] p= v[i].getParameters();
	    for(Parameter b:p)
	    {
	    	System.out.println(" constructor parameter"+ b);
	    }
	}
	
	
	}}