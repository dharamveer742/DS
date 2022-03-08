package Recursion.Iterative;

public class digitReverse {

    int rev (int N){
        int s=0;
        while(N!=0) {
            s = s * 10;
            s += N % 10;
            N = N / 10;
        }
        return s;

    }
    public boolean palindromeNumber(int n){

        return rev(n)==n;

    }


    public static void main(String[] args) {
        digitReverse v = new digitReverse();
        System.out.println( v.rev(121));
        System.out.println(v.palindromeNumber(121));
    }



}
