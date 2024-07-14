package Intermediate.recursion;
//print 5 to 1  
public class p1 {

        
            public static void printNum(int n) {
                //base case
                if(n==0){
                    return;
                }
                System.out.println(n);
                printNum(n-1);
                
            }
    
        public static void main(String[] args) {
            int num=5;
            printNum(num);
            
        }
}
