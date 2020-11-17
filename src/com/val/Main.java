package com.val;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Please enter an integer numerator: ");
                int numerator = scanner.nextInt();

                System.out.println("Please enter and integer denominator: ");
                int denominator = scanner.nextInt();

                int result = quotient(numerator, denominator);
                System.out.printf("%nResult: %d / %d = %d%n", numerator, denominator, result);

            } catch (InputMismatchException inputMismatchException) {

                System.out.printf("Error: ArithmeticException was thrown\n");
                System.out.printf("Suggestion: You cannot enter 0\n");

            } catch (ArithmeticException arithmeticException) {
                System.out.printf("Error: ArithmeticException was thrown\n");
                System.out.printf("Suggestion: You cannot enter 0\n");

            }
        } while (true);
    }

    public static int quotient(int numerator, int denominator) throws ArithmeticException {

        return numerator / denominator;
    }
}

