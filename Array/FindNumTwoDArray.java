package Array;
import java.util.Scanner;
public class FindNumTwoDArray {
    
        public static void main(String[] args) {
            Scanner obj= new Scanner(System.in);
            System.out.println("Enter no. of rows for array");
            int rows=obj.nextInt();
            System.out.println("Enter no. of column for Array");
            int cols=obj.nextInt();
            int Array[][]= new int[rows][cols];
            // input 
            System.out.println("Enter the data");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    Array[i][j]=obj.nextInt();
                }
            }
            System.out.println("Enter a number to find");
            int num=obj.nextInt();
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(num==Array[i][j]){
                        System.out.println(num+" found at =="+(i+1)+","+(j+1));
                        // break; if only one matched element have to find
                    }
                }
            }
        }
}
