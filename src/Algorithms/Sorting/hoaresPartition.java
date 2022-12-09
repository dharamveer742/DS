package Algorithms.Sorting;

import java.util.Arrays;

public class hoaresPartition {
    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int hoare(int[] arr,int low,int high) {
        int pivot = arr[low];
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do{
                i++;
            } while(arr[i] < pivot);
            do {
                j--;
            } while(arr[j] > pivot);

            if (i >= j) {
                return j;   // on the left side smaller elements are present  than the elements present on the right side
            }
            swap(arr, i, j);
        }
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int p = hoare(arr,low,high);
            quickSort(arr,low,p);
            quickSort(arr,p+1,high);

        }
    }

    public static void main(String[] args) {
        int[] arr={5,3,8,4,2,7,1,10};
        quickSort(arr,0,7);
        System.out.println(Arrays.toString(arr));


    }

}
