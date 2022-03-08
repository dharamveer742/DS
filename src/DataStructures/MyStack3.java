
// Implementation of stack by using array

package DataStructures;
public class MyStack3 {
    int[] arr;
    int size;
    int top ;

    MyStack3(int size){
        this.size=size;
        arr = new int[size];
        top=-1;
    }

    public void push(int g){
        if(top>=size){
            System.out.println("Stack Full");
            return ;
        }
        top+=1;
        arr[top]=g;
    }

    public int Peek(){
        if(top==-1){
            System.out.println("Stack Empty");
            return -1;
        }

        return arr[top];
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack Empty");
            return -1;
        }
        int re = arr[top];
        top=top-1;
        return re;
    }

    public boolean isEmpty(){
        return(top==-1);
    }
    public int size(){
        return top;
    }
    public void Print(){
        int c =top;
        while(c!=-1){
            System.out.println("Element is "+arr[c]);
            c=c-1;
        }
    }

    public static void main(String[] args) {

        MyStack3 c = new MyStack3(6);
        c.push(50);
        c.push(45);
        c.pop();


        c.Print();

    }



}
