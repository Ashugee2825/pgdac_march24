package genrics_collection;
//we want to restrict R to be Numeric type only
//class Calculation<R> extends Exception --> not allowed generics should not inherit exception 

class Calculation<R extends Number> 
{
	Calculation()
	{
		System.out.println(" welcome to generic classes");
	}
}
public class GenericBoundType {

	public static void main(String[] args) {
		Calculation<Integer> k= new Calculation<Integer>();
		Calculation<Float> k1= new Calculation<Float>();
		Calculation<Double> k2= new Calculation<Double>();
		Calculation<Short> k3= new Calculation<Short>();
		Calculation<Byte> k4= new Calculation<Byte>();
		//Calculation<String> k5= new Calculation<String>(); //error 
		

	}

}
