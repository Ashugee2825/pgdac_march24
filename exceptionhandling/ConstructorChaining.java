package exceptionhandling;

public class ConstructorChaining {
	 public static void main(String[] args) {
	        Child child = new Child();
	    }
}

class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child Constructor");
    }
}
