package collection3;

import java.util.PriorityQueue;


public class PersonCollection {

	public static void main(String[] args) {

Person p1= new Person(13,"ashu");
Person p2= new Person(12,"deepak");
Person p3= new Person(17,"chetan");
Person p4= new Person(1,"jayant");
Person p5= new Person(6,"bina");
PriorityQueue<Person> k=new PriorityQueue<Person>();
k.add(p1);//add will call compareTo method of its own class 
k.add(p2);
k.add(p3);
k.add(p4);
k.add(p5);
System.out.println(k);


	}

}
