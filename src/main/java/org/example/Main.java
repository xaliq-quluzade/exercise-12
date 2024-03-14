package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10, 5));
        System.out.println(calculator.subtract(10, 5));
        System.out.println(calculator.multiply(10, 5));
        System.out.println(calculator.divide(10, 5));
        System.out.println(calculator.divide(10, 0));
    }
}