package DP;

public class Fibonacci {
    int[] memo = {-1,-1,-1,-1,-1};
    int res=-1;
    public int fib(int n){

        if(memo[n]==-1){
            if(n==0 || n==1 ){
                res=n;

            }
            else {
                res = fib(n - 1) + fib(n - 2);
                memo[n]=res;
            }
        }

        return memo[n];

    }

    public static void main(String[] args) {
        Fibonacci ob = new Fibonacci();
        System.out.println(ob.fib(2));

    }
}
