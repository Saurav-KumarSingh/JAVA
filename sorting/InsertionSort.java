package sorting;

public class InsertionSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 8, 4, 9 };
        // insertion sort
        // timecomplexity=O(n^2)
        for (int i = 0; i < arr.length - 1; i++) {
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]) {
                arr[j+1]=arr[j];
                j--;
            }
            //placement of element
            arr[j+1]=current;

        }
        printArray(arr);
    }
}
