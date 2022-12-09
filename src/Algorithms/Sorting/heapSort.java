package Algorithms.Sorting;

import java.util.Arrays;

public class heapSort {

    public void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public void build(int[] arr,int n){
        for(int i=(n-2)/2;i>=0;i--){
            Heapify(arr,i,n);
        }
    }
    public void Heapify(int[] arr,int p,int n){
        int largest = p;
        int left = (2*p)+1;
        int right =(2*p)+2;
        if(left<n &&  arr[left] > arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]> arr[largest]){
            largest=right;
        }

        if(largest!=p){
            swap(arr,p,largest);
            Heapify(arr,largest,n);
        }

    }
    public void heapSort(int[] arr,int n){
        build(arr,n);
        for(int l=n-1;l>=1;l--){
            swap(arr,0,l);
            Heapify(arr,0,l);   // last index has largest element so we call it for 1 less than to reduce the size of heap

        }
    }

    public static void main(String[] args) {
        heapSort ob = new heapSort();
        int[] arr={10,-2,15,50,4,20};
        ob.heapSort(arr,6);
        System.out.println(Arrays.toString(arr));
    }







}
