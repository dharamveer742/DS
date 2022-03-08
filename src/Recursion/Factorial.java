package Recursion;

public class Factorial {

    public int Fact(int n) {

        if(n<1){
            return 1;
        }
        int sum=n* Fact(n-1);
        return sum;


    }


    public static void main(String[] args) {
        Factorial c = new Factorial();

        System.out.println("Fact is -> "+c.Fact(5));


    }

}
