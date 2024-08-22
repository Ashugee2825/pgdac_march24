package Multthreading;

class Process implements Runnable
{
    Thread t;
    String msg;
    Process(String a)
    {
    	t= new Thread(this);
    	msg= a;
    	t.start();
    }
	@Override
	public void run() {
	  try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(msg);
				Thread.sleep(1000);
			}
		}catch(Exception e) {}
	}
	}
public class UsingRunnablePart2 {

	public static void main(String[] args) {
		 
		Process p= new Process("JAVA");
		Process p1= new Process("PHP");
		
	}

}



