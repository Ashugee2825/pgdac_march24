package Multthreading;
//Runnable --functional interface 
interface test
{
	void sum(int a,int b);
	
}
public class lambda2 {

	public static void main(String[] args) {
		
		test e=(a,b)->{System.out.println(a+b);};
		
		e.sum(10,20);

	}

}
