package genrics_collection;
//demonstrate genrics with method argument and return type
//wild card character ? 
//mention that method or field can acept object of any type 
class Product1<T>
{
	private T item;
	public Product1(T item)
	{
		this.item= item;
	}
	public T getItem()
	{
		return item;
	}
}

public class Generic51{
   public static void showupperBound(Product<? extends Number> p) //upper bound Wildcard-- number child class can only be passed 
   {  System.out.println(p.getItem());}
	 
   public static void showlower(Product<? super Integer> p) //lower bound Wildcard -- parent of Integer class can only be passed  
   {  System.out.println(p.getItem());}
  
   public static void show(Product<?> p) //unbounded wildcard -- unknown type
  {
	  System.out.println(p.getItem());
  }
	public static void main(String[] args) {

	 // unbound wildcard 
		Product <Integer> x= new Product(100);
		show(x);
		
  	//line 19 method is called	
	Product <Float> x1= new Product(100.22f);
	show(x1);
	
	//line 21 only parent class of Number can be passed here 
	Product <Number> r5= new Product(11);
	showlower(r5);
	
		
	}

}
