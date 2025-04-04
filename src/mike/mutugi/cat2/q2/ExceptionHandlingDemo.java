package mike.mutugi.cat2.q2;

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } finally {
            scanner.close();
        }
    }
}

