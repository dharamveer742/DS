package Algorithms;

import java.util.Arrays;

public class Bubble_Sort {

    int[] Sort(int[] arr) {                                   // Method for bubble sorting
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                arr[i]=arr[i]^arr[i+1];
                arr[i+1]=arr[i]^arr[i+1];
                arr[i]=arr[i]^arr[i+1];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] k = {1, 8, 29, 5, 4};
        Bubble_Sort g = new Bubble_Sort();
        g.Sort(k);
        System.out.println(Arrays.toString(g.Sort(k)));


    }


}
