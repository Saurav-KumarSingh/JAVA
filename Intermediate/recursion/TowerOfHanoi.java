import java.util.Scanner;

public class TowerOfHanoi {

    public static void towerOfHanoi(int n, String src, String helper, String destination) {
        if (n == 1) {
            System.out.println("transfer disk\t" + n + "\tfrom\t" + src + "\tto\t" + destination);
            return;
        }
        towerOfHanoi(n - 1, src, destination, helper);
        System.out.println("transfer disk\t" + n + "\tfrom\t" + src + "\tto\t" + destination);
        towerOfHanoi(n - 1, helper, src, destination);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks in tower: \t");
        int n = sc.nextInt();

        towerOfHanoi(n, "Source", "Helper", "Destination");
    }
}
