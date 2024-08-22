package Multthreading;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Data {
    public void readdata(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int c;
            while ((c = br.read()) != -1) {
                System.out.print((char) c);
                Thread.sleep(1000);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
