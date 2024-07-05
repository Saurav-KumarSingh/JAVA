package Array;
import java.util.Scanner;
public class TwoDArray {
    
        public static void main(String[] args) {
            Scanner obj= new Scanner(System.in);
            System.out.println("Enter no. of rows for array");
            int rows=obj.nextInt();
            System.out.println("Enter no. of column for array");
            int cols=obj.nextInt();
            int Array[][]= new int[rows][cols];
            // input 
            System.out.println("Enter the data");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    Array[i][j]=obj.nextInt();
                }
            }
            System.out.println("Output of array");
            // output
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    System.out.print(Array[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
}
