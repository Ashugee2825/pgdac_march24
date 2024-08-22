 package construct_inheritance;
 
//super -- used to call parent class variables ,methods ,constructor
//whenever we create child class object first parent class no argument constructor is always called first 
//Question how to call child class parameterized constructor 
//solution write super (a) in first line of child class constructor 

class Stationary
{
    	// 	Stationary()	     {	 System.out.println("Stationary no argument");	}
	
		 Stationary( int u)	{		System.out.println("stationary with argument");	}
}

class Pencil extends Stationary
{
	 Pencil()     	{ super(0);		System.out.println("pencil no argument "); 	}

	Pencil(int a)	{
		super(a);    //explicitly calling parent class parameterized constructor 
		System.out.println("Pencil with argument");	
	}
}
public class SuperConstructorExample {
	public static void main(String[] args) {
		
		Pencil p= new Pencil(12);

	}

}
