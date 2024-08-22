package genrics_collection;

import java.util.List;

class Person<T>
{
}
class xyz extends Person
{}

class Emp<T>
{
	
}

public class Generic6 {

	static void show(Emp <? extends Person> e)
	{
		
	}
	
	public static void main(String[] args) {

   		Emp <Integer> e= new Emp();
		
		Emp <Person > e1= new Emp();
		
		Emp <xyz> e2= new Emp();
		
		show(e2);
		

	}

}
