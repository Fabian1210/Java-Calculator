package com.calculator;

import com.calculator.Calculator;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        double num1 = input.nextDouble();

        System.out.println("Enter another number: ");
        double num2 = input.nextDouble();

        double sum = Calculator.addSum(num1, num2);

        System.out.println(num1 + " + " + num2 + " = " + sum);
        input.close();
    }
}
