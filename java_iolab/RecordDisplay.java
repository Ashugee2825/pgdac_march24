package java_iolab;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RecordDisplay {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            System.out.print("Enter your age: ");
            String age = reader.readLine();
            System.out.print("Enter your address: ");
            String address = reader.readLine();

            System.out.println("\nRecord:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: " + address);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
