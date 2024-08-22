package exceptionhandling;

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CommandLineArgs {
    public static void main(String[] args) {
        int sum = 0;
        try {
            for (String arg : args) {
                int num = Integer.parseInt(arg);
                if (num < 10) {
                    throw new MyException("Number " + num + " is less than 10");
                }
                sum += num;
            }
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (MyException e) {
            System.out.println("MyException: " + e.getMessage());
        }
    }
}

