package collection3;

import java.util.*;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer> r= new PriorityQueue<Integer>();
        r.offer(90);
        r.offer(23);
        r.add(56);
        r.add(467);
        r.add(1);
        
        System.out.println(r.poll());//it will not follow FIFO 
        System.out.println(r.poll());//it will sort data in natural order 
        System.out.println(r.poll());//remove it 
        
	}

}
