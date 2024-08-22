package collection2;

import java.util.*;
//Map stores data in key value pair 
//HashMap        --random  , one null key or multiple values allowed
//LinkedHashMap  -- insertion order  one null key or multiple values allowed 
//TreeMap       --ascending order of key / null key not allowed 
//Map doesnot inherits Collection interface 
//map duplicate key is not allowed 

public class MapExample {

	public static void main(String[] args) {

		//HashMap<String,Integer> m= new HashMap<String,Integer>();
		
		//LinkedHashMap<String,Integer> m= new LinkedHashMap<String,Integer>();
		
		TreeMap<String,Integer> m= new TreeMap<String,Integer>();
		m.put("ashu", 124357);
		m.put("bina", 55);
		m.put("riya", 454565);
		m.put("om", null);
		m.put("ashu", null);
		m.put("chetan", 12137);

//		System.out.println(m);
//		System.out.println(m.containsKey("ashu"));
//		System.out.println(m.containsValue(55));
//		System.out.println(m.get("bina"));
//		traverse  data using collection and iterator 
		
		
		Collection c= m.values();
		
		Iterator r= c.iterator();
		while(r.hasNext())
		{
			System.out.println(r.next());
		}	
	//  traversing using foreach and lambda expression	
		
		m.forEach((key,value)->System.out.println(key +"    "+ value));
		
		 
		
		

	}

}
