package java_iolab;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputDisplay {

    public static void main(String[] args) {
        // Command line input
        if (args.length > 0) {
            String commandLineInput = args[0];
            System.out.println("Command Line Input: " + commandLineInput);
        } else {
            System.out.println("No command line input provided.");
        }

        try {
            // BufferedReader input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a string (BufferedReader): ");
            String bufferedReaderInput = reader.readLine();
            System.out.println("BufferedReader Input: " + bufferedReaderInput);

            // Scanner input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string (Scanner): ");
            String scannerInput = scanner.nextLine();
            System.out.println("Scanner Input: " + scannerInput);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
