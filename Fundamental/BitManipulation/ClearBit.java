package BitManipulation;

public class ClearBit {
    
        public static void main(String[] args) {
            //clear 3nd bit of position=2  and n=5 (0101)

        // process
        //         1)  bitMask=1<<position
        //         2) perform AND with NOT bitMask operation
        
        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;

        n=n & (~bitMask);
        System.out.println(n);
        }
}
