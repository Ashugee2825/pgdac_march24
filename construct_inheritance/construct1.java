package construct_inheritance;

public class construct1 {
	
	int a;
	void show(int a)
	{
		a++;     // linr 9 a is local variable to show method
		this.a =a;
		this.a++; // line 9 a variable is instance variable of class 
	}
void display()
{
	System.out.println(a);
}
public static void main(String[]args) {
	
	construct1 c = new construct1();
	c.show(10);
	c.display();
}
}
