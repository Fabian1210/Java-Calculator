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
        System.out.println("Type: " +
                "\n'+' to add " +
                "\n'-' to subtract " +
                "\n'*' to multiply " +
                "\n'/' to divide ");

        operator = input.next();

        switch (operator) {
            case "+":
                double sum = Calculator.addNums(num1, num2);
                System.out.println(num1 + " + " + num2 + " = " + sum);
                break;
            case "-":
                double subtract = Calculator.subtractNums(num1, num2);
                System.out.println(num1 + " - " + num2 + " = " + subtract);
                break;
            case "*":
                double multiply = Calculator.multiplyNums(num1, num2);
                System.out.println(num1 + " * " + num2 + " = " + multiply);
                break;
            case "/":
                double divide = Calculator.divideNums(num1, num2);
                System.out.println(num1 + " / " + num2 + " = " + divide);
                break;
            default:
                System.out.println("Wrong input");
        }
        input.close();
    }
}
