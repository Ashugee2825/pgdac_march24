package Multthreading;
//shared resource 
//want to acquire lock on an object

class ThreadEx2 extends Thread
{   BannerData b;
    String msg ;
    ThreadEx2(BannerData k, String msg)
    {
    	b=k;
    	this.msg= msg;
    }
	public void run()
	{//synchronized block 
		synchronized(b) {
		  b.display(msg);
	    }
	}
}
public class Sync1 {

	public static void main(String[] args) {
		
		BannerData d= new BannerData();
		ThreadEx2 g= new ThreadEx2(d,"java");
		ThreadEx2 g1= new ThreadEx2(d,"PHP");
		g.start();
        
       
        g1.start();
        
	}

}


