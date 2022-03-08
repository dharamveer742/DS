
// Circular queue by linkedList


package DataStructures;

public class CircularQueue {
    Node front;
    Node rear;

    class Node{
        int data;
        Node next;

        Node(int n){
            data=n;
            next=null;
        }
    }


    public void enqueue(int n){
        Node ne = new Node(n);
        if(front==null){
            front = rear=ne;
            return ;
        }

        rear.next=ne;
        rear=ne;
        rear.next=front;
    }

    public void dequeue(){
        if(front==null){
            System.out.println("empty");
            return;
        }
        System.out.println("Deleted "+front.data);
        if(front==rear){
            front=rear=null;
        }
        else {

            front = front.next;
            rear.next = front;
        }
    }
    public void display(){
        if(front==null){
            System.out.println("empty");
            return;
        }
        Node temp=front;
        while(temp.next!=front){

            temp = temp.next;
        }
        System.out.println(temp.data);


    }
    public void peek(){
        if(front==null){
            System.out.println("empty");
            return;
        }

        System.out.println(front.data);


    }

    public static void main(String[] args) {
        CircularQueue n = new CircularQueue();
        n.enqueue(5);
        n.enqueue(6);
        n.enqueue(7);
        n.dequeue();
        n.dequeue();
        n.dequeue();
        n.dequeue();
        n.peek();
        n.display();

    }



}
