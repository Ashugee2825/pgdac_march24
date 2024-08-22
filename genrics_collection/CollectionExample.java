package genrics_collection;
// Collection -- implementation of datastructure 
//all collections are generic 

import java.util.*;

public class CollectionExample {

	public static void main(String[] args) 
	{
   
   LinkedList<Integer> l= new LinkedList<Integer>();
   l.add(10231);
   l.add(10341);
   l.add(10341);
   l.add(101343);
   l.add(10341);
   l.add(3301);
   
   l.add(2, 300);
   l.remove(0);
   System.out.println(l.contains(300));
   System.out.println(l.get(0));
   System.out.println(l);
   
   

	}

}
