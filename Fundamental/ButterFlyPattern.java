package Fundamental;

public class ButterFlyPattern {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            // for first half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for spaces
            int spaces= 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for(int i=n;i>=1;i--){
            // for first half
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for spaces
            int spaces= 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}