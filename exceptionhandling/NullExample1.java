package exceptionhandling;


class Test
{
	int y=11;
}
public class NullExample1 {

	public static void main(String[] args) {
	try {	
   Test t= new Test();
   Test k=t;
   t= null;
   k.y=100;  //NullPointerException
   System.out.println(k.y);
		
	}catch(NullPointerException r) {}
	}

}
