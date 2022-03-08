// Singly queue by linkedList
package Practise;

public class My_Queue {
    Node front;
    Node rear;

    class Node{
        int  value;
        Node next;
        Node(int element){
            value=element;
            next=null;
        }
    }

    public void enqueue(int a){          // offer()
        Node ne = new Node(a);
        if(front==null){
            front=rear=ne;
            return;
        }
        rear.next=ne;
        rear=ne;
    }

    public void dequeue(){                  // poll()
        if(front==null ){
            System.out.println("empty");
            return;
        }
        front=front.next;

    }
    public void peek(){                  // peek() method does not throw exception
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(front.value);
    }

    public static void main(String[] args) {

        My_Queue on = new My_Queue();

        on.enqueue(4);
        on.enqueue(5);
        on.dequeue();
        on.peek();
        on.dequeue();
        on.dequeue();



    }


}
