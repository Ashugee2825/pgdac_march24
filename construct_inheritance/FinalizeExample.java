package construct_inheritance;
//java doesnot have destructor concept it has auto garbage collection 
//all class inherit Object class 
// what is parent class of all classes --> Object



public class FinalizeExample {

	
	 
	public static void main(String[] args) {
		 
		Monitor m= new Monitor();
		
		Monitor m1= new Monitor();
		
		m=null;
		m1=null;
		 
		System.gc();// perform garbage collection 
		//System --class name 
		//gc () - its predefined method 
		//this method calls finalize method 
		
		
	}

}


 