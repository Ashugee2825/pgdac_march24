package collection3;
class Person implements Comparable<Person>
{
	int id;
	String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Person o) {
		
		return this.name.compareTo(o.name);
	}
	
}
