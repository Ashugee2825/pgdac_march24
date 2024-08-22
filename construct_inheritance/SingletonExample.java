package construct_inheritance;
//singleton design pattern 
//restrict a class to create only single instance
//by creating private constructor 
// create reference of  class inside its own class  like in line 12  
//creating factory methods that return same class object   like in line 20 

class Connect
{
	String url;
	String password;
	static Connect c = new Connect();
	Connect()
	{
	
	url="www.abc.com";
	password="test123";
	}
	
	static Connect getConnect()
	{
		return c;
	}
	void display()
	{
		System.out.println(url +"  "+ password);
	}
}

public class SingletonExample {

	public static void main(String[] args) {
		 
		Connect r = Connect.getConnect();
		Connect r1 = Connect.getConnect();
		r.display();
		


	}

}
