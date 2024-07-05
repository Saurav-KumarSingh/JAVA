package Fundamental;
import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number for factorial");
        int a=obj.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
            fact*=i;

        }
        System.out.println("factorial of "+a+"="+fact);
    }
}
