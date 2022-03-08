package Algorithms;

public class Binary_Search {
    int Binary(int[] arr,int key){
        int low = 0;
        int high = arr.length - 1;

        while(high>=low){
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                return(mid);
            }
            else if (key > arr[mid]){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }

        }

        return -1;
    }
}
class Q{
    public static void main(String[] args) {
        int[] ar ={23,45,56,78,88,99,102};   //  Only for sorted array
        Binary_Search o = new Binary_Search();
        System.out.println(o.Binary(ar, 8));
    }

}
