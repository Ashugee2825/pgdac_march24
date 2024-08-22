package construct_inheritance;

class Mobile1
{
	void app()
	{
     System.out.println(" old mobile application ");		
	}
	 
}
//Method overriding -- when parent class and child clas have method with same signature 

class NewMobile1 extends Mobile
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

public class SuperExample4 
 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
