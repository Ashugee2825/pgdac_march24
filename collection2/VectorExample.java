package collection2;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Integer> v= new Vector<Integer> ();
		System.out.println("size="+v.size());//  0
		System.out.println("capacity "+v.capacity()); //10
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		v.add(6);
		v.add(7);
		v.add(8);
		v.add(9);
		v.add(10); 
		v.add(11); 
		System.out.println("size="+v.size());//  10
		System.out.println("capacity "+v.capacity()); //20 double if 11th record is added
		
		System.out.println(v.firstElement());
		

	}

}
