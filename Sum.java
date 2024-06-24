import java.util.Scanner;
public class Sum {
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            // sum of two numbers
            System.out.println("Enter two numbers");
            int a = in.nextInt(); //read a
            float b= in.nextFloat();//read b
            float sum=a+b;
            System.out.println("Sum of a & b = " + sum);
        }
    }
}
