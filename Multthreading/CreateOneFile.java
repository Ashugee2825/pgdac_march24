package Multthreading;

import java.io.FileWriter;
import java.io.IOException;

public class CreateOneFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("one.txt")) {
            writer.write("Welcome to the Java world!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
