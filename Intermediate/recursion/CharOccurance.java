import java.util.Scanner;

public class CharOccurance {

    public static int first = -1, last = -1;

    public static void firstAndLastOcuurance(int idx, String str, char element) {
        if(idx==str.length()){
            System.out.println(first+1);
            System.out.println(last+1);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }

        }
        firstAndLastOcuurance(idx + 1, str, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :\t");
        String str = sc.next();
        System.out.println("Enter a Character to find 1st & last ocurrance:\t");
        char element = sc.next().charAt(0);

        firstAndLastOcuurance(0, str, element);
    }
}
