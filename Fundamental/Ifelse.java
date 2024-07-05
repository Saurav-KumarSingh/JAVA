package Fundamental;
import java.util.*;
public class Ifelse {
    public static void main(String args[]){
        try(Scanner obj= new Scanner(System.in)){
            System.out.println("Enter a number");
            int a = obj.nextInt();
            if(a%2==0){
                System.out.println("number is even");
            }
            else{System.out.println("Number is odd");}
        }

        
    }
}
