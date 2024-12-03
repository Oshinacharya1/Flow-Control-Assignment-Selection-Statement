package utils;
import static utils.Methods.*;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        System.out.println("Select from the menu: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            // Task 1 & 2: Maximum of two and three numbers
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.println("Maximum of two: " + maxOfTwo(a, b));
        } else if (choice == 2) {
            System.out.print("Enter first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter second number: ");
            int b = scanner.nextInt();
            System.out.print("Enter three numbers: ");
            int c = scanner.nextInt();
            System.out.println("Maximum of three: " + maxOfThree(a, b, c));
        } else if (choice == 3) {
            // Task 3: Divisible by 3
            System.out.print("Enter a number divisible by 3: ");
            int num = scanner.nextInt();
            System.out.println(num + " is " + (num % 3 == 0 ? "" : "not ") + "divisible by 3.");
        } else if (choice == 4) {
            // Task 4: Divisible by 5
            System.out.print("Enter a number divisible by 5: ");
            int num = scanner.nextInt();
            System.out.println(num + " is " + (num % 5 == 0 ? "" : "not ") + "divisible by 5.");

        } else if (choice == 5) {
            // Task 5: Divisible by 11
            System.out.print("Enter a number divisible by 11: ");
            int num = scanner.nextInt();
            System.out.println(num + " is " + (num % 11 == 0 ? "" : "not ") + "divisible by 11.");

        } else if (choice == 6) {
            // Task 6: Even or Odd
            System.out.print("Enter a number to see if its odd or even: ");
            int num = scanner.nextInt();
            System.out.println(num + " is " + (num % 2 == 0 ? "even." : "odd."));

        } else if (choice == 7) {
            // Task 7: Leap Year
            System.out.print("Enter a year to see if its a leap year: ");
            int year = scanner.nextInt();
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println(year + " is " + (isLeap ? "" : "not ") + "a leap year.");
        } else if (choice == 8) {
            // Task 8: Check Digit
            System.out.print("Enter a character to check whether a given input is digit or not : ");
            char ch = scanner.next().charAt(0);
            System.out.println(ch + " is " + (Character.isDigit(ch) ? "" : "not ") + "a digit.");

        } else if (choice == 9) {
            // Task 9: Check Alphabet
            System.out.print("Enter a character to check whether a given input is alphabet or not: ");
            char ch = scanner.next().charAt(0);
            System.out.println(ch + " is " + (Character.isLetter(ch) ? "" : "not ") + "an alphabet.");

        } else if (choice == 10) {
            // Task 10: Digit, Alphabet, or Special Character
            System.out.print("Enter a character  to check if a given input is a Digit or Alphabets or Special Character: ");
            char ch = scanner.next().charAt(0);
            if (Character.isDigit(ch)) {
                System.out.println(ch + " is a Digit.");
            } else if (Character.isLetter(ch)) {
                System.out.println(ch + " is an Alphabet.");
            } else {
                System.out.println(ch + " is a Special Character.");
            }

        } else if (choice == 11) {
            // Task 11: Positive or Negative
            System.out.print("Enter a number to check whether a given number is a positive or negative number: ");
            int num = scanner.nextInt();
            System.out.println(num + " is " + (num >= 0 ? "Positive." : "Negative."));

        } else if (choice == 12) {
            // Task 12: Celsius to Fahrenheit
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        } else if (choice == 13) {
            // Task 13: Fahrenheit to Celsius
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);

        } else if (choice == 14) {
            // Task 14: Vowel or Consonant
            System.out.print("Enter a character: ");
            char ch = scanner.next().toLowerCase().charAt(0);
            if ("a e i o u".indexOf(ch) != -1) {
                System.out.println(ch + " is a Vowel.");
            } else {
                System.out.println(ch + " is a Consonant.");
            }

        } else if (choice == 15) {
            // Task 15: Uppercase or Lowercase
            System.out.print("Enter a character: ");
            char ch = scanner.next().charAt(0);
            if (Character.isUpperCase(ch)) {
                System.out.println(ch + " is Uppercase.");
            } else if (Character.isLowerCase(ch)) {
                System.out.println(ch + " is Lowercase.");
            } else {
                System.out.println(ch + " is neither Uppercase nor Lowercase.");
            }

        } else if (choice == 16) {
            System.out.print("Enter a number (1-7): ");
            int day = scanner.nextInt();
            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");
            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else if (day == 7) {
                System.out.println("Sunday");
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
            }
        } else if (choice == 17) {
            // Task 17: Number of days in a given month
            System.out.print("Enter a month (1-12): ");
            int month = scanner.nextInt();
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("31 days");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30 days");
            } else if (month == 2) {
                System.out.println("28 or 29 days (depending on leap year)");
            } else {
                System.out.println("Invalid input! Please enter a month between 1 and 12.");
            }

        } else if (choice == 18) {
            // Task 18: Type of triangle
            System.out.print("Enter side 1: ");
            int a = scanner.nextInt();
            System.out.print("Enter side 2: ");
            int b = scanner.nextInt();
            System.out.print("Enter side 3: ");
            int c = scanner.nextInt();
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }

        } else if (choice == 19) {
            // Task 19: Check voting eligibility
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            if (age >= 18) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible to vote");
            }

        } else if (choice == 20) {
            // Task 20: Division based on marks
            System.out.print("Enter percentage: ");
            double percentage = scanner.nextDouble();
            if (percentage >= 60) {
                System.out.println("Division 1");
            } else if (percentage >= 45) {
                System.out.println("Division 2");
            } else if (percentage >= 30) {
                System.out.println("Division 3");
            } else {
                System.out.println("Fail");
            }

        } else if (choice == 21) {
            // Task 21: Percentage and grade based on marks in 5 subjects
            System.out.print("Enter marks for Maths: ");
            int maths = scanner.nextInt();
            System.out.print("Enter marks for Physics: ");
            int physics = scanner.nextInt();
            System.out.print("Enter marks for Chemistry: ");
            int chemistry = scanner.nextInt();
            System.out.print("Enter marks for English: ");
            int english = scanner.nextInt();
            System.out.print("Enter marks for Nepali: ");
            int nepali = scanner.nextInt();
            int total = maths + physics + chemistry + english + nepali;
            double percentage = (total / 5.0);

            System.out.println("Percentage: " + percentage + "%");
            if (percentage >= 90) {
                System.out.println("Grade: A");
            } else if (percentage >= 80) {
                System.out.println("Grade: B");
            } else if (percentage >= 70) {
                System.out.println("Grade: C");
            } else if (percentage >= 60) {
                System.out.println("Grade: D");
            } else if (percentage >= 40) {
                System.out.println("Grade: E");
            } else {
                System.out.println("Grade: F");
            }
        }
    }

    // Method to display the menu
    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Maximum of two numbers");
        System.out.println("2. Maximum of three numbers");
        System.out.println("3. Enter a number Divisible by 3");
        System.out.println("4. Enter a number Divisible by 5");
        System.out.println("5. Enter a number Divisible by 11");
        System.out.println("6. Check whether a given number is even or odd Even or Odd");
        System.out.println("7.  Check whether a year is leap year or not");
        System.out.println("8.  Check whether a given input is digit or not");
        System.out.println("9. Check whether a given input is alphabet or not");
        System.out.println("10. Check if a given input is a Digit, Alphabet, or Special Character");
        System.out.println("11. Check whether a given number is Positive or Negative");
        System.out.println("12. Convert  temperature from Celsius to Fahrenheit");
        System.out.println("13.  Convert temperature from Fahrenheit to Celsius");
        System.out.println("14.  Check whether a character is a Vowel or Consonant");
        System.out.println("15.  Check whether a given character is uppercase or lowercaseUppercase or Lowercase");
        System.out.println("16. Print weekday for a given input");
        System.out.println("17. Print number of days in a given month");
        System.out.println("18. Check type of triangle");
        System.out.println("19. Check voting eligibility");
        System.out.println("20. Division based on marks");
        System.out.println("21. Percentage and grade based on marks in 5 subjects");
    }
}



