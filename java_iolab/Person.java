package java_iolab;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    double salary;
    String address;

    public Person(String name, int age, double salary, String address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Salary: " + salary + ", Address: " + address;
    }
}

public class PersonRecord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        Person person = new Person(name, age, salary, address);

        try (FileOutputStream fos = new FileOutputStream("person.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(person);
            System.out.println("Person record saved successfully.");
            System.out.println("Person Record: " + person);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
