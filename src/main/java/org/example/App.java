package org.example;

import java.util.Scanner;

/**
 * BMI Calculator
 */
public class App {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);

        double weight, height, BMI;

        System.out.print("Please enter your height: ");
        height = scanner.nextDouble();
        System.out.print("Please enter your weight: ");
        weight = scanner.nextDouble();

        BMI = (weight / (height * height)) * 703;
        System.out.printf("Your BMI is %.1f%n", BMI);

        if (BMI < 18.5) {
            System.out.println("You are underweight. You should see a doctor");
            return;
        }

        if (BMI > 32.5) {
            System.out.println("You are underweight. You should see a doctor");
            return;
        }

        System.out.println("You are within the ideal weight range.");

    }
}
