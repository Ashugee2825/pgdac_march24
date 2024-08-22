package collection2;
import java.util.*;
//List -- maintains duplicate record
//LinkedList 
//ArrayList 
//Vector
  //--> Stack 
//iterator can only move forward
//List Iterator can go backward or previous also 

public class ListExample {

	public static void main(String[] args) {
		/*LinkedList l= new LinkedList();//by default type is object
		
		   l.add("neha");
		  l.add("neha");
		  l.add(22);
		  l.add("noida");
		  l.add(true);
		  l.add(10.33f);
		
		 */
		 LinkedList<Integer> l= new LinkedList<Integer>();
		  l.add(2);
		  l.add(456);
		  l.add(222);
		  l.add(124);
		  l.add(0,100);
		  l.add(10);
		  l.add(10);
		
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
