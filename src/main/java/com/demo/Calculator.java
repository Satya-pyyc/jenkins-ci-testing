package com.demo;

import java.util.Scanner;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Maven Calculator ===");
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = scanner.next();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        switch (op) {
            case "+":
                System.out.println("Result: " + calc.add(a, b));
                break;
            case "-":
                System.out.println("Result: " + calc.subtract(a, b));
                break;
            case "*":
                System.out.println("Result: " + calc.multiply(a, b));
                break;
            case "/":
                System.out.println("Result: " + calc.divide(a, b));
                break;
            default:
                System.out.println("Invalid operator!");
        }
        scanner.close();
    }
}
