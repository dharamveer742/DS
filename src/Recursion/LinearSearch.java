package Recursion;

//

import java.util.ArrayList;

public class LinearSearch {
   static public boolean search(int [] arr,int index,int target){

        if(index==arr.length)
            return false;

        return arr[index]==target || search(arr,index+1,target);
    }

    static public ArrayList<Integer> IndexSearch(int [] arr,int index,int target,ArrayList<Integer> List){

        if(index==arr.length)
            return List;     //index == 5

        if(arr[index]==target)
            List.add(index);
        IndexSearch(arr,index+1,target,List); //
        return List;
    }

    static public int FindIndex(int [] arr,int index,int target){

        if(index==arr.length)
            return -1;

        if(arr[index]==target){
            return index;
        }
        else {

            return FindIndex(arr, index + 1, target);
        }


    }

    public static void main(String[] args) {
        int a[] = {1, 3, 3, 5, 6} ;
        System.out.println(search(a, 0, 8));
        ArrayList<Integer> h = new ArrayList<Integer>();
        System.out.println(FindIndex(a,0,6));


    }








   }
