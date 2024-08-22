package collection3;

import java.util.LinkedList;

public class ListWithEmp {

	public static void main(String[] args) {

	    Emp e1= new Emp(1,"amit");
	    Emp e2= new Emp(2,"chetan");
	    Emp e3= new Emp(3,"bina");
	    Emp e4= new Emp(4,"gagan");
	    Emp e5= new Emp(5,"neha");
	    
	    LinkedList <Emp>l= new LinkedList<Emp>();
	    l.add(e1);
	    l.add(e2);
	    l.add(e3);
	    l.add(e4);
	    l.add(e5);
	    System.out.println(l);
	    
	    

	}

}
