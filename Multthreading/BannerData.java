package Multthreading;

class BannerData
{
	//synchronized void display(String msg)
	 void display(String msg)
	{
		try {
		System.out.print(" [ ");
		System.out.print (msg);
		Thread.sleep(1000);
		System.out.print(" ] ");
	}
	catch(Exception d) {}
		
	}
}
