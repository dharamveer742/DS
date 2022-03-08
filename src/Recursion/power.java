package Recursion;

public class power {
    static public int exp(int base,int exponent){
        if(exponent==0 ){
            return 1;
        }
        return base*exp(base,exponent-1);  // 1,2,4,8



    }

    public static void main(String[] args) {

        System.out.println(exp(2,3));
    }
}
