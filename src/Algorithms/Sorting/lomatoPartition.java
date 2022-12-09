package Algorithms.Sorting;
import java.util.Arrays;
public class lomatoPartition {

    static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static int partition(int[] arr,int low,int high){

        int pivot=arr[high];
        int w=low-1;
        for(int i=low;i<=high-1;i++){
            if(arr[i]<=pivot){
                w++;
                swap(arr,w,i);
            }
        }
        swap(arr,w+1,high);
        return w+1;
    }
    static void quickSort(int[] arr,int low,int high){
        if(low<high){

            int p=partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={8,4,7,9,3,10,5};
        int p=partition(arr,0,6);
        System.out.println(p);
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,6);
        System.out.println(Arrays.toString(arr));
    }
}