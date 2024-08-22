package Multthreading;

public class MainClassReading {

    public static void main(String[] args) {
        Data data = new Data();
        
        // Create thread objects
        ThreadRead1 thread1 = new ThreadRead1(data, "one.txt");
        ThreadRead2 thread2 = new ThreadRead2(data, "two.txt");
        
        // Start the threads
        thread1.start();
        thread2.start();
    }
}
