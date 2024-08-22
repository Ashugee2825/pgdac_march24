package construct_inheritance;
//constructor chaining is calling constructor from anothr constructor 
class Test1
{
	int x,y;
	Test1()
	{
		System.out.println("welcome to no argument constructor");
	}
	Test1(int x)
	{   this();  
		System.out.println("one argument constructor");
	}
	Test1(int x,int y)
	{   this(x);
		System.out.println("two argument constructor");
	}
	
}
public class ConstructorChaining {

	public static void main(String[] args) {
		 Test1 r= new Test1(11,22);
	
	}}
