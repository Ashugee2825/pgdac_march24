package exceptionhandling;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int sum = 0;

        try {
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                numbers[i] = Integer.parseInt(scanner.next());
                sum += numbers[i];
            }
            double average = (double) sum / n;
            System.out.println("The average is: " + average);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}

