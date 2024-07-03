package String;
import java.util.*;
public class StrBuilder {
    
        public static void main(String[] args) {
            StringBuilder sb= new StringBuilder("Saurav");  //way to declare stringByilder

            System.out.println(sb);

            //char at index x
            System.out.println(sb.charAt(4));
            
            //set char at any index or replace

            sb.setCharAt(0, 's');
            System.out.println(sb);
            
            //add chat at index
            
            sb.insert(0, 'S');
            System.out.println(sb);

            //delete the i to j
            sb.delete(0, 1);
            System.out.println(sb);

            //apend at last 
            sb.append(" Kumar");
            System.out.println(sb);

        }
}
