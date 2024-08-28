package string.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to StringCalculator Kata!");

        System.out.println("We need to test the methods of the calculator\n" +

                "Multiply: think of two numbers less than 1000");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int number2 = scanner.nextInt();


        if (number1 < 1000 && number2 < 1000) {
            StringCalculator calculator = new StringCalculator();
            int result = calculator.multiply(number1 + "," + number2);
            System.out.println("Result: " + result);
        } else {
            System.out.println("Both numbers must be less than 1000.");
        }

        System.out.println("Thank you!");

        scanner.close();
    }
}