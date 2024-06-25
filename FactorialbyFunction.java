import java.util.Scanner;

public class FactorialbyFunction {

    public static int factorial(int a) {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int a = obj.nextInt();
        int fact=factorial(a);
        System.out.println("factorial of " + a + "=" + fact);

    }
}
