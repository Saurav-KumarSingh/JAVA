package String;
import java.util.*;

public class Strings {
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String a=sc.nextLine();
            System.out.println("My name is : "+a);
            // size of string
            System.out.println("Size : "+a.length());
            // charAt  :- used for get index number of string
            for(int i=0;i<a.length();i++){
                System.out.println(a.charAt(i));
            }

            // compareTo  : used for compare the 2 strings
            String name1="yash";
            String name2="yash";
            //chceck s1>s2  -> +ve value
            // s1<s2 -> -ve value
            // s1==s2  -> 0
            if(name1.compareTo(name2)==0){
                System.out.println("Strings are equal");
            }
            else{
                System.out.println("strings are not equal");
                if(name1.compareTo(name2)<0){
                    System.out.println("name1 < name2");
                }
                else{
                    System.out.println("name1 > name2");
                }
            }

            // substring
            // syntax data.substring(beggining index,ending index);
            System.out.println(a.substring(a.length()/2,a.length()));
        }
    
}
