package Intermediate.sorting;

public class QuickSort {
    public static int partition(int arr[],int low,int high){
     int pivot=arr[high];
     int i=low-1;
     for(int j=low;j<high;j++){
        if(arr[j]<pivot){
            i++;
            // swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
     }
     i++;
     int temp =arr[i];
     arr[i]=arr[high];
     arr[high]=temp;
     return i;
    }
    public static void sort(int arr[],int low,int high){
        if(low<high){
            int pivot=partition(arr,low,high);
            // elements < pivot
            sort(arr,low,pivot-1);
            // element >pivot
            sort(arr, pivot+1, high);
        }
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = { 3, 5, 1, 8, 4, 9 };
        // Quick sort
        // time complexity = O(n^2)
        int high=arr.length-1,low=0;
        sort(arr,low,high);
        printArray(arr);
    }
}
