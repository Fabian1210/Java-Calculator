package com.calculator;

import com.calculator.Calculator;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1;
        double num2;
        String operator;

        System.out.println("Enter a number: ");
        num1 = input.nextDouble();
        System.out.println("Enter another number: ");
        num2 = input.nextDouble();
        System.out.println("Type '+' to add or '-' to subtract: ");
        operator = input.next();

        if (operator.equals("+")) {
            double sum = Calculator.addNums(num1, num2);
            System.out.println(num1 + " + " + num2 + " = " + sum);
        } else if (operator.equals("-")) {
            double subtract = Calculator.subtractNums(num1, num2);
            System.out.println(num1 + " - " + num2 + " = " + subtract);
        } else {
            System.out.println("Wrong input ");
        }

        input.close();
    }
}
