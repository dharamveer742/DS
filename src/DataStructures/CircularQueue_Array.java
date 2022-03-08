// circular queue by array

package DataStructures;

public class CircularQueue_Array {

    int front ;
    int rear;
    int[] arr;
    int capacity;

    CircularQueue_Array(int capacity){
        front=-1;
        rear=-1;
        this.capacity=capacity;
        arr =new int[capacity];

    }

    public void enqueue(int n){
        if((rear+1)%capacity==front){
            System.out.println("Full");
            return;
        }
        if(front==-1){
            front=front+1;
        }
        rear=(rear+1)%capacity;
        arr[rear]=n;
    }
    public void dequeue(){
        if(front==-1 && rear ==-1){
            System.out.println("Empty");
            return ;
        }
        System.out.println("Deleted "+arr[front]);
        if(front==rear){
            front=rear=-1;
            return;

        }
        front=front+1;

    }
    public void peek(){
        if(front==-1 && rear==-1){
            System.out.println("empty");
            return;
        }
        System.out.println(arr[front]);
    }


    public static void main(String[] args) {
        CircularQueue_Array b = new CircularQueue_Array(5);
        b.enqueue(3);
        b.enqueue(4);
        b.enqueue(5);
        b.enqueue(6);
        b.enqueue(7);
        b.enqueue(8);
        b.enqueue(9);


        b.dequeue();
        b.dequeue();
        b.dequeue();

        b.dequeue();

        b.peek();


    }






}
