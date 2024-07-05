package BitManipulation;

public class SetBit {
    
        public static void main(String[] args) {
            //set 2nd bit of position=1  and n=5 (0101)

        // process
        //         1)  bitMask=1<<position
        //         2) perform OR operation
        
        int n = 5; // 0101
        int pos = 1;
        int bitMask = 1 << pos;

        n=bitMask|n;
        System.out.println(n);
        }
}
