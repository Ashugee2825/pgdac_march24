package java_iolab;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileParse {

    public static void main(String[] args) {
        String filePath = "E:\\Ashutosh\\Advance Computing learning\\OOPs With Java\\Day1.txt"; // Adjust path as needed
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
















