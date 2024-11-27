package utils;

public class Methods {

    // 1. Find maximum of two numbers
    public static int maxOfTwo(int a, int b) {
        return Math.max(a, b);
    }

    // 2. Find maximum of three numbers
    public static int maxOfThree(int a, int b, int c) {
        return maxOfTwo(maxOfTwo(a, b), c);
    }

    // 3–5. Check divisibility
    public static boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    // 6. Check if a number is even
    public static boolean isEven(int number) {
        return isDivisibleBy(number, 2);
    }

    // 7. Check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 8. Check if input is a digit
    public static boolean isDigit(char input) {
        return Character.isDigit(input);
    }

    // 9. Check if input is an alphabet
    public static boolean isAlphabet(char input) {
        return Character.isLetter(input);
    }

    // 10. Identify character type (digit, alphabet, or special character)
    public static String characterType(char input) {
        if (Character.isDigit(input)) return "Digit";
        if (Character.isLetter(input)) return "Alphabet";
        return "Special Character";
    }

    // 11. Check if a number is positive or negative
    public static String checkNumberSign(int number) {
        return number >= 0 ? "Positive" : "Negative";
    }

    // 12–13. Convert temperature
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // 14. Check if a character is a vowel
    public static boolean isVowel(char ch) {
        return "A E I O U a e i o u".indexOf(ch) != -1;
    }

    // 15. Check if a character is uppercase or lowercase
    public static String checkCase(char ch) {
        if (Character.isUpperCase(ch)) return "Uppercase";
        if (Character.isLowerCase(ch)) return "Lowercase";
        return "Not an alphabet";
    }

    // 16. Get day of the week
    public static String getWeekDay(int day) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        return day >= 1 && day <= 7 ? days[day - 1] : "Invalid day";
    }

    // 17. Get number of days in a month
    public static int getDaysInMonth(int month, boolean isLeapYear) {
        switch (month) {
            case 2: return isLeapYear ? 29 : 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }

    // 18. Check triangle type
    public static String triangleType(int a, int b, int c) {
        if (a == b && b == c) return "Equilateral";
        if (a == b || b == c || a == c) return "Isosceles";
        return "Scalene";
    }

    // 19. Check voting eligibility
    public static boolean isEligibleToVote(int age) {
        return age >= 18;
    }

    // 20. Calculate division based on percentage
    public static String getDivision(double percentage) {
        if (percentage >= 60) return "Division 1";
        if (percentage >= 45) return "Division 2";
        if (percentage >= 30) return "Division 3";
        return "Fail";
    }

    // 21. Calculate grade based on percentage
    public static String getGrade(double percentage) {
        if (percentage >= 90) return "A";
        if (percentage >= 80) return "B";
        if (percentage >= 70) return "C";
        if (percentage >= 60) return "D";
        if (percentage >= 40) return "E";
        return "F";
    }
}
