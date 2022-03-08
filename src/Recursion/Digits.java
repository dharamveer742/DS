package Recursion;

public class Digits {
    int c=0;

    public int Digit_Sum(int n ){
        if(n==0){
            return 0;
        }
        return Digit_Sum(n/10)+n%10;

    }

    public static void main(String[] args) {
        Digits d =new Digits();
        System.out.println(d.Digit_Sum(78));
    }


}
