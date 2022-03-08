package Recursion;

public class PrintElements {

    public void print(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);



    }

    public static void main(String[] args) {
        PrintElements n = new PrintElements();
        n.print(5);
    }


}

