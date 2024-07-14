package Intermediate.recursion;

import java.util.Scanner;

public class XtopowerN {

        // stack height=N;
        // public static int calcPower(int x, int n){
        //     if(x==0 && n!=0){
        //         return 0;
        //     }
        //     else if(x==0 && n==0){
        //         System.out.println("undefined");
        //         return 1;
        //     }
        //     else if(x!=0 && n==0){
        //         return 1;
        //     }
        //     int xPower1=calcPower(x, n-1);
        //     System.out.println(xPower1);
        //     int xPowerN=x*xPower1;
        //     return (xPowerN);
        // }
    

        // stack height=log(N)

        public static int calcPower(int x, int n){
            if(x==0 && n!=0){
                return 0;
            }
            if(x==0 && n==0){
                System.out.println("undefined");
                return 1;
            }
            if(x!=0 && n==0){
                return 1;
            }
            
            //n==even
            if(n%2==0){
                return (calcPower(x,n/2)*calcPower(x, n/2));
            }
            //n==odd
            else{
                return (calcPower(x,n/2)*calcPower(x, n/2)*x);
            }
        }

        public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         System.out.println("Enter a number");
         int x=sc.nextInt();
         System.out.println("Enter the power");
         int n=sc.nextInt();
        int res=calcPower(x,n);
        System.out.println(res);
        }
}
