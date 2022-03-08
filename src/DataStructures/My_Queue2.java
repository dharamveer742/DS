
// Singly queue by array

package DataStructures;

public class My_Queue2 {
    int[] arr;
    int size;
    int front;
    int rear;

    My_Queue2(int s){
        size =s;
        arr = new int[size];
        front=-1;
        rear=-1;

    }
    public void Enqueue(int n){
        if(front==-1){
            front=front+1;
        }
        if(rear==size-1){
            System.out.println("Queue is full");
            return ;
        }
        rear=rear+1;
        arr[rear]=n;
    }
    public void dequeue(){
        if(front==-1 && rear==-1){
            System.out.println("Queue is empty");
            return ;
        }

        System.out.println("deleted "+arr[front]);
        if(front==rear){
            front=rear=-1;
            return ;
        }

        front = front+1;

    }
    public void Tra(){
        if(front==-1 || rear==-1){
            System.out.println("Queue is empty");
            return;
        }
        int c= front;
        while(c<=rear){
            System.out.println(arr[c]);
            c=c+1;
        }

    }




    public static void main(String[] args) {
        My_Queue2 d = new My_Queue2(3);
        d.dequeue();
        d.Enqueue(4);
        d.Enqueue(5);
        d.Enqueue(6);
        d.Enqueue(7);
        d.dequeue();
        d.dequeue();
        d.dequeue();
        d.dequeue();
        d.Tra();


         d.dequeue();
        System.out.println();
        d.Tra();
       // System.out.println(d.isFull());


    }


}
