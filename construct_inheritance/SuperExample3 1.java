package construct_inheritance;

class Mobile
{
	void app()
	{
     System.out.println(" old mobile application ");		
	}
	 
}
//Method overriding -- when parent class and child clas have method with same signature 

class NewMobile extends Mobile
{
	void app()
	{
		System.out.println("new mobile app ");
		
	}
	void show()
	{
		super.app(); //call base class app method 
		app();       // call its own class method 
		
	}
}

public class SuperExample3 
 {

	public static void main(String[] args) {
		NewMobile n= new NewMobile();
		n.show();
		

	}

}
