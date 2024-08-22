
package exceptionhandling;

import java.util.Scanner;

public class Division {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter numerator:");
	        int x = scanner.nextInt();
	        
	        System.out.println("Enter denominator:");
	        int y = scanner.nextInt();
	        
	        try {
	            double result = divide(x, y);
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Exception: " + e.getClass().getSimpleName());
	        }
	        
	        scanner.close();
	    }
	    
	    public static double divide(int x, int y) throws ArithmeticException {
	        if (y == 0) {
	            throw new ArithmeticException("Division by zero");
	        }
	        return (double) x / y;
	    }
	

	}


