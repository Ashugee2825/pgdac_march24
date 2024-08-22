package java_iolab;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UpperCaseConverter {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String input;
            while (true) {
                System.out.print("Enter a string (or type 'quit' to exit): ");
                input = reader.readLine();
                if ("quit".equalsIgnoreCase(input)) {
                    break;
                }
                System.out.println("Uppercase: " + input.toUpperCase());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
