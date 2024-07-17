package Intermediate.sorting;

public class MergeSort {

    // time complexity =O(nlogn)
    public static void conquer(int arr[],int si,int mid,int ei){
        // O(n)
        int merged[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        
        // merge both list by comparision
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<arr[idx2]){
                merged[x++]=arr[idx1++];
            }
            else{
                merged[x++]=arr[idx2++];
            }
        }
        // after comparision elements in 1st list  remains
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        // after comparision elements in 2nd list  remains
        while(idx2<=ei){
            merged[x++]=arr[idx2++];
        }
        // copy merged array in main array
        // for(int i=0,j=si;i<merged.length;i++,j++){
        //     arr[j]=merged[i];
        // }
        for (int i = 0; i < merged.length; i++) {
            arr[si + i] = merged[i];//to ensure that copy accurate element from merged to arr[]
        }
        
    }
    public static void divide(int arr[],int si,int ei){
        // O(logn)
        int mid=si+(ei-si)/2;
        if(si>=ei){
            return;
        }
        // divide left
        divide(arr,si,mid);
        // divide right
        divide(arr,mid+1,ei);
        // call merging or conquer
        conquer(arr,si,mid,ei);
        
    }
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int arr[]={10,12,3,2,4,6,3,4,5};
        int ei=arr.length-1;
        divide(arr,0,ei);
        sort(arr);
    }
}
