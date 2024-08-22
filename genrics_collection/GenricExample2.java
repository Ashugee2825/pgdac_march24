package genrics_collection;
//multiple parameters

class Test2<T,K>
{
	T a;
	K b;
	Test2(){}
	Test2(T a,K b)
	{
		this.a=a;
		this.b=b;
		
	}
	void display()
	{
		System.out.println("a="+ a +" b ="+ b);
	}
}
public class GenricExample2 {

	public static void main(String[] args) {
		 Test2  <Integer,String>r = new Test2<Integer,String>(11,"java");
		 r.display(); 
	}

}
