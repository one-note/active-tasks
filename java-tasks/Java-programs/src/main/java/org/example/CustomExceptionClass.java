package org.example;

class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}

class AgeValidator {
    public static void validateAge(int age) throws InvalidAge {
        if (age <= 18) {
            throw new InvalidAge("Invalid age");
        }
    }
}


public class CustomExceptionClass {
    public static void main(String[] args) {
        try {

            AgeValidator.validateAge(20);
            System.out.println("Age is valid!");

            AgeValidator.validateAge(16);
            System.out.println("The above is the exception causing value");
        } catch (InvalidAge e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}
