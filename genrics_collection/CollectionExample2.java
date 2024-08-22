package genrics_collection;
// Collection -- implementation of datastructure 
//all collections are generic 
//
//mcq 

import java.util.*;

public class CollectionExample2 {

	public static void main(String[] args) 
	{
   
   LinkedList<String> l= new LinkedList<String>();
   l.add("neha");
   l.add("ashu");
   l.add("gangan");
   l.add("priya");
   l.add(2, "kamal");
   l.remove(0);
 
   System.out.println(l.get(0));
   System.out.println(l);

	}

}
