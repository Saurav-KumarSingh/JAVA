import java.util.Scanner;

public class SubSequence {
    
        public static void subsequences(int idx,String str,String newStr){

            if(idx==str.length()){
                System.out.println(newStr);
                return;
            }

            char currChar=str.charAt(idx);
            //choose
            subsequences(idx+1, str, newStr+currChar);
            //don't choose
            subsequences(idx+1, str, newStr);
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter an unique string:\t");
            String str=sc.next();

            subsequences(0, str, "");
        }
}
