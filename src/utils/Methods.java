package utils;

public class Methods {
    public static int maxOfTwo(int a, int b) {
        return Math.max(a, b);
    }
    public static int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }
}
