package com.val;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        boolean continueLoop = true;

        do {
            try {

                System.out.println("\nPlease enter an integer numerator: \t");
                int numerator = scanner.nextInt();

                System.out.println("\nPlease enter and integer denominator: \t");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);
//                continueLoop = false;

            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("Error: Input was incorrect\n");
                System.out.printf("Suggestion: You must enter integer values\n");

                System.err.printf("%s%n%n", inputMismatchException.getMessage());
                inputMismatchException.printStackTrace();

                StackTraceElement[] traceElements = inputMismatchException.getStackTrace();

                for(StackTraceElement element : traceElements) {

                    System.out.printf("%s\t", element.getClassName());
                    System.out.printf("%s\t", element.getFileName());
                }

                scanner.nextLine();

            } catch (ArithmeticException arithmeticException) {
                System.out.printf("Error: ArithmeticException was thrown\n");
                System.out.printf("Suggestion: You cannot enter 0\n");

            }
            finally {
                System.out.println("This is the finally statement, cleanup can fo on here");
            }
        } while (true);
    }

    public static int quotient(int numerator, int denominator) throws ArithmeticException {

        return numerator / denominator;
    }
}

