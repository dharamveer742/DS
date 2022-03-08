package Recursion;

public class Product {
   static public int pro(int n){
       if(n==1){
           return 1;
       }
       return pro(n/10)*(n%10);

   }

    public static void main(String[] args) {
        System.out.println("Product of a digit is "+pro(1234));
    }
}
