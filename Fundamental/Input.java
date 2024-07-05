package Fundamental;
import java.util.Scanner;
public class Input {
    
    public static void main(String ags[])
    {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.println("Enter a number");
            int a=obj.nextInt();//taking input as integer
            System.out.println(a);
        }

    }
}
