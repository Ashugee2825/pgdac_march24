package genrics_collection;
//similar to c++ template
//Generic Classes or parameterized class 
//<variablename>  should be capital letter 
//generic always work with class it doesnot work with primitive datatype 
//if we donot pass any type then by default it is Object
class Test<T>
{
	T a, b;
	Test(){}
	Test(T a,T b)
	{
		this.a=a;
		this.b=b;
		
	}
	
	
	void display()
	{
		System.out.println("a="+ a +" b ="+ b);
	}
}
public class GenricExample1 {

	public static void main(String[] args) {
		 Test  <Integer>r = new Test<Integer>(11,22);
		 r.display();
		 
		 Test  <String>r1 = new Test<String>("java","world");
		 r1.display();
		 
		 Test  <String>r2[] = new Test[2];
		 r2[0]= new Test();
		 r2[1]= new Test();
		 r1.display();
		  
	}

}
