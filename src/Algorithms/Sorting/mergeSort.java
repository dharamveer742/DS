package Algorithms.Sorting;

import java.util.Arrays;

public class mergeSort {


    void merge(int array[],int l,int m,int r){
        int i,j,k;
        int n1=(m-l)+1;
        int n2=r-m;
        int[] L=new int[n1];
        int[] R=new int[n2];
        for( i=0;i<n1;i++){
            L[i]=array[l+i];
        }
        for( j=0;j<n2;j++){
            R[j]=array[m+1+j];   // n1 we get wrong output
        }
        i=0;
        j=0;
        k=l;
        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
                array[k]=L[i];
                i++;k++;
            }
            else{
                array[k]=R[j];
                j++;k++;
            }
        }
        while(i<n1){
            array[k]=L[i];
            i++;k++;
        }
        while(j<n2){
            array[k]=R[j];
            j++;k++;
        }
        System.out.println(Arrays.toString(array));



    }

    public void Sort(int[] a ,int l,int r){
        if(l<r){
            int m =l+(r-l)/2;
            Sort(a,l,m);
            Sort(a,m+1,r);
            merge(a,l,m,r);
        }

    }

    public static void main(String[] args) {


        mergeSort ob = new mergeSort();
        int[] a={12, 11, 13, 5, 6, 7,0};
        ob.Sort(a,0,6);
        System.out.println(Arrays.toString(a));

    }
}
