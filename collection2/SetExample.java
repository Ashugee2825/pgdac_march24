package collection2;

import java.util.*;

//Set -- maintains unique 
//HashSet        --hashcode -->random -- faster
//LinkedHashSet  --insertion order    -- slow in comparision to hashset 
//TreeSet        --ascending order   -- slowest
//all collection classes are generic

//Null value is allowed in HashSet And Linked hashset but not in TreeSet 
//In treeSet null value gives NullPointerException
public class SetExample {

	public static void main(String[] args) {

		//HashSet<String> s =new HashSet<String> ();
		//LinkedHashSet<String> s =new LinkedHashSet<String> ();
		TreeSet<String> s =new TreeSet<String> ();
		s.add("neha");
		s.add("amit");
		s.add("chetan");
		s.add("gagan");
		s.add("bina");
		//s.add(null); 
		
		//s.remove("chetan");
		
		//System.out.println(s);
		
		//traverse the data in set 
		Iterator i= s.iterator();
		while(i.hasNext())
		{
			System.out.println(" "+i.next());
		}
		

	}

}
