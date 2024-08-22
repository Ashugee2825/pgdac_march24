package java_iolab;

import java.io.File;
import java.util.Scanner;

public class FileInfo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Executable: " + file.canExecute());
            System.out.println("File Size: " + file.length() + " bytes");
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
