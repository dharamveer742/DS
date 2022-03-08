package Recursion;

public class Fibonaci {
    public int fib(int n){
        if(n<2){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Fibonaci c = new Fibonaci();
        System.out.println(c.fib(2));
    }


}
