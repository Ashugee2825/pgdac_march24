package collection3;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {

		Queue<String> r= new LinkedList<String>();
		 
		//LinkedList<String> r= new LinkedList<String>();
		r.add("amit");
		r.add("neha");
		r.add("jayant");
		r.add("manish");
		System.out.println(r.poll()); //fifo
		System.out.println(r.poll());
		System.out.println(r.poll());
		System.out.println(r.poll());
		//System.out.println(r.poll());//null
		System.out.println(r.remove());//NoSuchElementException
		
		
		
		
		
		

	}

}
