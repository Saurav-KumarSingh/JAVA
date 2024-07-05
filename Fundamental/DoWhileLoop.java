package Fundamental;
import java.util.Scanner;
public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number for table");
        int a=obj.nextInt();
        int i=1;
        do{
            System.out.println(a+"x"+i+"= "+(a*i));
            i++;

        }
        while(i<=10);
    }
}
