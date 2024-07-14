package Intermediate.recursion;

import java.util.Scanner;

public class sumN {

    public static void sumOfNumber(int i,int n,int sum){
        if(i==n){
            sum+=i;
            System.err.println("sum of "+n+"=\t"+sum);// ?
            return;
        }
        sum+=i;
        sumOfNumber(i+1, n, sum);
    }
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number to print");
            int num=sc.nextInt();
            int sum=0;
            sumOfNumber(1, num, sum);
        }
}
