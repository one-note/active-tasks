package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


public class SimpleCalculator {
    private static final Logger logger = LoggerFactory.getLogger(SimpleCalculator.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        logger.info("Simple SimpleCalculator");
        logger.info("Available Operations:");
        logger.info("1. Addition (+)");
        logger.info("2. Subtraction (-)");
        logger.info("3. Multiplication (*)");
        logger.info("4. Division (/)");

        System.out.print("Select an operation (1/2/3/4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                int sum = add(num1, num2);
                logger.info("Result: {}", sum);
            }
            case 2 -> {
                int sub = subtract(num1, num2);
                logger.info("Result: {}", sub);
            }
            case 3 -> {
                int mul = multiply(num1, num2);
                logger.info("Result: {}", mul);
            }
            case 4 -> {
                try {
                    double quotient = divide(num1, num2);
                    logger.info("Result: {}", quotient);
                } catch (ArithmeticException e) {
                    logger.error("Error: {}", e.getMessage());
                }
            }
            default -> {
                logger.error("Invalid operation selected.");
                System.out.println("Please select a valid operation");
            }

        }

        scanner.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            logger.info("The user has selected an invalid operation");
            throw new ArithmeticException("Number can not be divided by zero");

        }
        return (double) a / b;
    }
}
