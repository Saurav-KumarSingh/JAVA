package Array;
// import java.util.Scanner;

public class FindNum {
    public static void main(String[] args) {
        int number[] ={10,15,7,4,8,9,3,4,2};
        int n=8;
        int size=number.length;
        for (int i = 0; i < size; i++) {
           if(n==number[i]){
            System.out.println(n+" is Found at position\t"+(i+1));
            break;
           }
        }
    }
}