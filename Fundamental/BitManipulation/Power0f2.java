package BitManipulation;

import java.util.Scanner;

public class Power0f2 {
    
        public static void main(String[] args) {
            
            // Write a program to find if a number is a power of 2 or not.

            Scanner sc=new Scanner(System.in);
            System.out.print("Enter A number :  ");
            int num=sc.nextInt();

            if((num& (num-1))==0){
                System.out.println(num +" is power of 2");
            }else{
                System.out.println(num +" is not power of 2");
            }
        }
}
