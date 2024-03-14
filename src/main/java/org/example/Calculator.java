package org.example;

public class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public Double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Sifira bolmek olmaz!");
            return null;
        }
        return num1 / num2;
    }
}
