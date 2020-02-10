/*
recursive methods to reverse a string, find an index of a factorial and an index of a Fibonacci sequence.
 */

public class Recursion {

    public static String reverseString(String s) {
        if(s.equals(""))
            return "";
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static int findFactorialRecursive(int number) {
        if(number < 0)
            return -1;
        if(number == 0 || number == 1)
            return 1;
        return number * findFactorialRecursive(number - 1);

    }

    public static int fibonacciRecursive(int number) {
        if(number < 0)
            return -1;
        if(number == 0 || number == 1)
            return number;
        return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }
}
