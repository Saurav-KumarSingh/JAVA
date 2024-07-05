package Fundamental;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int a=obj.nextInt();
        int fact=1,i=1;
        while(i<=a){
            fact*=i;
            i++;

        }
        System.out.println("factorial of "+a+"="+fact);
    }
}
