package Algorithms.Sorting;

import java.util.Scanner;

public class selectionSort {

    public void Sort(int[] arr,int size){
        for(int p=0;p<size-1;p++){
            int min_ind=p;
            for(int c=p+1;c<size;c++){
                if(arr[c]<arr[min_ind]){
                    min_ind=c;
                }

            }
            swap(arr,min_ind,p);
        }
    }

    public void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSort ob = new selectionSort();
        ob.Sort(arr,n);
        ob.printArray(arr);

    }

}