package Fundamental;
import java.util.*;
public class Switchstt {
  public static void main(String args[]){
    System.out.println("Press 1,2 or 3");
    try(Scanner obj=new Scanner(System.in)){
        int a=obj.nextInt();
        switch (a) {
            case 1:System.out.println("Jai Johar");
                break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Hello");
            break;
        
            default:System.out.println("Jai Hind");
                break;
        }
    }
  }
}
