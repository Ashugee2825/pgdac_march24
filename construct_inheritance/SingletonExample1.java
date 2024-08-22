package construct_inheritance;
//singleton design pattern  ensures single instance of its class 
//restrict a class to create only single instance
//by creating private constructor 
// create reference of  class inside its own class  like in line 12  
//creating factory methods that return same class object   like in line 20 
class Connect1
{
	static String url;
	static String password;
	static Connect1 c= new Connect1();
	private Connect1()
	{
	
	url="www.abc.com";
	password="test123";
	}
	static Connect1 getConnect()  
	{
		return c;
	}
	void display()
	{
		System.out.println(url +"  "+ password);
	}
}
public class SingletonExample1 {

	public static void main(String[] args) {
		//Connect p= new Connect();//compile time error  
		Connect1 r = Connect1.getConnect();
		Connect1 r1 = Connect1.getConnect();
		r.display();
		r1.display();
		

	}

}
