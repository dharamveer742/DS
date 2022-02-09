package Practise;

import java.util.Scanner;

import java.util.Scanner;

public class MyStack2 {
    int top;
    int capacity;
    int[] a;


    MyStack2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        capacity=sc.nextInt();
        top=-1;                              // top must be -1 otherwise Exception  in peek
        a =new int[capacity];

    }

    public void push(int n ) throws ArrayIndexOutOfBoundsException{
        if(top>=a.length){
            throw new ArrayIndexOutOfBoundsException("Stack is full");

        }
        top=top+1;
        a[top]=n;

    }

    int peek() throws ArrayIndexOutOfBoundsException{
        if(top==-1){
            throw new ArrayIndexOutOfBoundsException("Stack is empty");

        }
        return a[top];

    }
    int pop() throws ArrayIndexOutOfBoundsException{
        int result=0;
        if(top==-1){
            throw new ArrayIndexOutOfBoundsException("Stack is empty");
        }
        return a[top--];

    }

    public static void main(String[] args) {
        MyStack2 c = new MyStack2();

        try{
            c.push(2);
            c.push(3);
            c.push(4);
            System.out.println(c.peek());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }





}
