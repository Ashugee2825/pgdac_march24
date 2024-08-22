package Multthreading;
//interface all methods are by default public and abstract 

//class inside another class --inner class
//class inside method --> local class 

//functional interface -- must have only one abstract method 
//unnamed method 
interface  calculate
{
	void display();
}


public class FunctionalInterfaceExample1  {

	public static void main(String[] args) {

		
	//local class ----------------------	
    class test implements calculate
    {
    	public void display() {System.out.println("welcome");}
    	
    }
    //-------------------------------
    
   //-------------local anonymous class----------- 
      calculate c= new calculate()
    		{
    	     public void display() {System.out.println("welcome");}
    	
    		};
    		
    // lamdba expression 
    // we are creating implementation of display method of calculate class 		
    		calculate x=()->{System.out.println("welcome using lambda expression");};
    		x.display();

	}

}
