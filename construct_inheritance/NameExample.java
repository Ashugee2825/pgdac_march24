package construct_inheritance;

import java.util.Scanner;

public class NameExample {

	public static void main(String[] args) 
	{
		 
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter size");
		
		int k= s1.nextInt();
		
		//System.out.flush();
		
		Scanner s= new Scanner(System.in);
		String n[]= new String[k];
		
		
		for(int i=0;i<5;i++)
		{
		
			System.out.println("enter name");
			n[i]= s.nextLine();
		}
		
		for(int i=0;i<5;i++)
		{
		
			System.out.println(	n[i]);
		}
	}

}
