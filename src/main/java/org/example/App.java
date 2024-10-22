package org.example;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Add: " + calculator.add(5, 3));
        System.out.println("Subtract: " + calculator.subtract(5, 3));
        System.out.println("Multiply: " + calculator.multiply(5, 3));
        System.out.println("Divide: " + calculator.divide(5, 1));
    }
}