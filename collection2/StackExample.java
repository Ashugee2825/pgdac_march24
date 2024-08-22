package collection2;
//Stack -- LIFO 
//Object -->Iterable-->Collection -->List-->Vector-->Stack
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
 
		Stack <Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
	 
		System.out.println(s.peek());//view last data
		System.out.println(s.peek());//view last data
		System.out.println(s.pop());//view last data
		System.out.println(s);
		
		

	}

}
