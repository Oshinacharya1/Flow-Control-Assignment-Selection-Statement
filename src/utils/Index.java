package utils;

import static utils.Methods.*;

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1 & 2: Maximum of two and three numbers
        System.out.print("Enter two numbers: ");
        int a = scanner.nextInt(), b = scanner.nextInt();
        System.out.println("Maximum of two: " + maxOfTwo(a, b));

        System.out.print("Enter three numbers: ");
        int c = scanner.nextInt();
        System.out.println("Maximum of three: " + maxOfThree(a, b, c));

        // Task 3–5: Divisibility
        System.out.print("Enter a number to check divisibility by 3, 5, and 11: ");
        int num = scanner.nextInt();
        System.out.println("Divisible by 3: " + isDivisibleBy(num, 3));
        System.out.println("Divisible by 5: " + isDivisibleBy(num, 5));
        System.out.println("Divisible by 11: " + isDivisibleBy(num, 11));

        // Task 6: Even or Odd
        System.out.println(num + " is " + (isEven(num) ? "Even" : "Odd"));

        // Task 7: Leap Year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        System.out.println(year + " is " + (isLeapYear(year) ? "a Leap Year" : "not a Leap Year"));

        // Task 8–10: Character Type
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Character type: " + characterType(ch));

        // Task 11: Positive or Negative
        System.out.println(num + " is " + checkNumberSign(num));

        // Task 12–13: Temperature Conversion
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));

        // Task 14–15: Vowel/Consonant and Case
        System.out.println(ch + " is " + (isVowel(ch) ? "Vowel" : "Consonant"));
        System.out.println(ch + " is " + checkCase(ch));

        // Task 16–17: Week Day and Month Days
        System.out.print("Enter day of the week (1–7): ");
        int day = scanner.nextInt();
        System.out.println("Weekday: " + getWeekDay(day));

        System.out.print("Enter month (1–12): ");
        int month = scanner.nextInt();
        System.out.println("Days in month: " + getDaysInMonth(month, isLeapYear(year)));

        // Task 18: Triangle Type
        System.out.print("Enter three sides of a triangle: ");
        int side1 = scanner.nextInt(), side2 = scanner.nextInt(), side3 = scanner.nextInt();
        System.out.println("Triangle type: " + triangleType(side1, side2, side3));

        // Task 19: Voting Eligibility
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        System.out.println("Eligible to vote: " + isEligibleToVote(age));

        // Task 20–21: Division and Grade
        System.out.print("Enter marks in 5 subjects: ");
        double totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += scanner.nextDouble();
        }
        double percentage = totalMarks / 5;
        System.out.println("Division: " + getDivision(percentage));
        System.out.println("Grade: " + getGrade(percentage));
    }
}