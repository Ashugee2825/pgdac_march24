package java_iolab;

class InsufficientArgumentsException extends Exception {
    public InsufficientArgumentsException(String message) {
        super(message);
    }
}

public class SortArray {

    public static void main(String[] args) {
        try {
            if (args.length < 7) {
                throw new InsufficientArgumentsException("Insufficient arguments provided. Please provide 7 integers.");
            }

            int[] numbers = new int[7];
            for (int i = 0; i < 7; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }

            // Sort array in ascending order
            java.util.Arrays.sort(numbers);

            System.out.println("Sorted Numbers: ");
            for (int number : numbers) {
                System.out.print(number + " ");
            }

        } catch (InsufficientArgumentsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("All arguments must be integers.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
