package utils;

import static utils.Methods.maxOfThree;
import static utils.Methods.maxOfTwo;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("The maximum is: " + maxOfTwo(num1, num2));

        System.out.print("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("The maximum is: " + maxOfThree(a, b, c));
    }
}

