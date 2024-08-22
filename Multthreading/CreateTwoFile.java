package Multthreading;

import java.io.FileWriter;
import java.io.IOException;

public class CreateTwoFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("two.txt")) {
            writer.write("Java is a high-level, class-based, object-oriented programming language.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
