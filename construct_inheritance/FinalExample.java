package construct_inheritance;

final class InventoryReport

{
	final int openingamount=50000;// variable value will not be modified 
	
	final void banner() //final method will not override
	{
		System.out.println(" welcome to abc technology");
		
	}
	
}

class xyz //extends InventoryReport  // final class cannot be inherited 
{
	
	
	//void banner()	{} //compile time error 
}

public class FinalExample {

	
	
}
