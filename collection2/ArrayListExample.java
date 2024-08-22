package collection2;

import java.util.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		 
		  ArrayList<Integer> l= new ArrayList<Integer>();
		  l.add(2);
		  l.add(456);
		  l.add(222);
		  l.add(124);
		  l.add(0,100);
		  l.add(10);
		  l.add(10);
		  l.add(0,11);
		  
		
		  Iterator i= l.iterator();
			while(i.hasNext())
			{
				System.out.print(" "+i.next());
			}
			
			System.out.println( "" );
			//line 48 to 52 traversing data using ListIterator 
			
			//ListIterator can go previous also 
			ListIterator k= l.listIterator();
			while(k.hasNext())
			{
				System.out.print(" "+k.next());
			}
			System.out.println( "" );
			while(k.hasPrevious())
			{
			  System.out.print( " " +k.previous());
			}
	}

}
