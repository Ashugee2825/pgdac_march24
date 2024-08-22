package java_iolab;
/*
 * Write a program to ask 7 int arrays from user through command line argument 
 * and display
them in ascending order .Create a user defined exception class that check where argument
entered by user is less than 7 and should be more than zero and handle all built in exception
raising In program .
 */

import java.util.Arrays;

class ArrayProblem extends Exception
{
	ArrayProblem()
	{
		System.out.println("array data incorrect");
	}
}
public class Q2 {

	public static void main(String[] args)
	{
		int a[]=null;
	
		 try {
		    a= new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			
			a[i]= Integer.parseInt(args[i]);
			if(a[i]<0 || a[i]>7) 
				throw  new ArrayProblem ();
			
			
		}}catch(ArrayProblem e) { return ;}
		Arrays.sort(a);
		
		for(int i=0;i<args.length;i++)
		{
		System.out.print( "  "+ a[i]);
		}
				
		}
		

	}

 