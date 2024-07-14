package Intermediate.recursion;

public class fibonacci {

    public static int fibonacciRecursion(int n) {
        if (n <= 2) {
            return n - 1;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static void main(String[] args) {
        int maxNumber = 10; // You can set the number of elements you want in the Fibonacci Series
        System.out.print("Fibonacci Series of " + maxNumber + " numbers:");
        // for (int i = 1; i <= maxNumber; ++i) {
        //     System.out.print(fibonacciRecursion(i) + " ");
        // }
        System.out.print(fibonacciRecursion(maxNumber) + " ");
    }
}
