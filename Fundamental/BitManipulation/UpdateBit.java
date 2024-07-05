package BitManipulation;

import java.util.Scanner;

public class UpdateBit {

    public static void main(String[] args) {
        // update 4th bit of position=3 and n=5 (0101) to 1
        System.out.println("Enter the operation to be perform for 1 or 0");
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 -> set; oper=0 -> clear
        int n = 5;
        int pos = 1;

        int bitMask = 1 << pos;
        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);

        }
    }
}
