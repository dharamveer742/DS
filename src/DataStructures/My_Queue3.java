package DataStructures;


//  Singly using array

public class My_Queue3{
    int[] arr;
    int front ;
    int size ;
    int rear;

    My_Queue3(int n){
        front=-1;
        rear=-1;
        size=n;
        arr= new int[size];
    }

    public void Enqueue(int data){
        if(isFull()){
            System.out.println("Overflow error");
            return;
        }
        if(front==-1){
            front=front+1;
        }
        if(rear+1==size){
            rear=0;
        }
        else{
            rear=rear+1;
        }
        arr[rear]=data;
    }
    public int Dequeue(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        int result = arr[front];
        if(front==rear){
            front=rear=-1;
        }
        else if(front+1==size){
            front=0;
        }
        else
            front++;
        return result;
    }
    public void Trav(){
        if(front==-1){
            System.out.println("Empty");
            return;
        }
        while(front<=rear){
            System.out.println(arr[front]);
            front=front+1;

        }
    }

    public boolean isEmpty(){
        return front==-1;
    }
    public boolean isFull(){
        if(front==0 && rear+1==size)
           return true;
        if(rear+1==front){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        My_Queue3 ov = new My_Queue3(3);
        ov.Enqueue(5);
        ov.Enqueue(6);
        ov.Enqueue(7);
        ov.Enqueue(8);

        ov.Dequeue();

        ov.Dequeue();ov.Dequeue();ov.Dequeue();ov.Dequeue();


        ov.Trav();
    }



}
