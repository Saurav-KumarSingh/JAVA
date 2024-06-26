package Array;
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner obj1 = new Scanner(System.in);
        int size = obj1.nextInt();
        int number[] = new int[size];
        System.out.println("Enter array elements");
        // input
        for (int i = 0; i < size; i++) {
            number[i] = obj1.nextInt();
        }
        //output
        for (int i = 0; i < size; i++) {
           System.out.print(number[i]+"\t");
        }
    }
}