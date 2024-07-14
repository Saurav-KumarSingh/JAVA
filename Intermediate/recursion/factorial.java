package Intermediate.recursion;

public class factorial {
    // public static int printFactorial(int n) {
    //     if (n == 0 ||n==1) {
    //         return 1;
    //     }
    //     int fact_n_1=printFactorial(n-1);
    //     int fact=n*fact_n_1;
    //     return fact;
    // }
    public static int printFactorial(int n) {
        if (n == 0 ||n==1) {
            return 1;
        }
        // int fact=printFactorial(n-1);
        // return(n*fact);

        return(n*printFactorial(n-1));
    }

    public static void main(String args[]) {
       int fact= printFactorial(5);
       System.out.println(fact);
    }
}
