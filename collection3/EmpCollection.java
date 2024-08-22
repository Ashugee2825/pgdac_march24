package collection3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

class Emp
{
	int id;
	String name;
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	
}
class NameComparator implements Comparator<Emp>
{ 


	@Override
	public int compare(Emp o1, Emp o2) {
		
		return o1.name.compareTo(o2.name); //0 -1 1
	}
	
}
public class EmpCollection {

	public static void main(String[] args) {

    Emp e1= new Emp(1,"amit");
    Emp e2= new Emp(2,"chetan");
    Emp e3= new Emp(3,"bina");
    Emp e4= new Emp(4,"gagan");
    Emp e5= new Emp(5,"neha");
    
    //HashSet<Emp> y= new HashSet<Emp>();
    //LinkedHashSet<Emp> y= new LinkedHashSet<Emp>();
    TreeSet<Emp> y= new TreeSet<Emp>(new NameComparator());
    y.add(e1);
    y.add(e2);//will call comapre method 
    y.add(e3);
    y.add(e4);
    y.add(e5);
    
    System.out.println(y);
    
    


	}

}
