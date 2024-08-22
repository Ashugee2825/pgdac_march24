package Multthreading;
//Runnable is a functional interface
//functional interface are interface having exactly one abstract method
//abstract methods are unimplemented method that must be implenmented by child class 
//to create thread we inherit runnable interface 
//runnable has single method called run
//thread class inherits Runnable 
class abc{}

class Banner extends abc  implements Runnable 
{

	@Override
	public void run() {
		 
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("banner");
				Thread.sleep(1000);
			}
		}catch(Exception e) {}
		
	}
	
}
public class UsingRunnable {

	public static void main(String[] args) {
		 Banner b= new Banner();
		 Thread t= new Thread(b);
		 t.start();
	      
	}

}


