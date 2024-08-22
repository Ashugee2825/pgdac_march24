package construct_inheritance;
//java doesnot have destructor concept it has auto garbage collection 
//all class inherit Object class 
// what is parent class of all classes --> Object

 

public class FinalizeExample2 {

	
	 
	public static void main(String[] args) {
		 
		
		Monitor k;//k is a reference variable
		
		new Monitor ();//here we are craeting object 
		
		Monitor m= new Monitor(); 
		
		
		Monitor p= m;
		
		m=null;
	    
		 
		System.gc();// finalize will be called only once for object created in line 14 
		
	}

}


 