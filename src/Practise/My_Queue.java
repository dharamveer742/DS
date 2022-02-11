package Practise;

public class My_Queue {
    Node head;
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
        if(head==null){
            head=ne;
            return;
        }
        Node current =head;

        while(current.next!=null);{
            current=current.next;

        }
        current.next=ne;
    }

    public void dequeue(){                  // poll()
        if(head==null ){
            System.out.println("error");
            return;
        }
        head=head.next;

    }
    public void peek(){                  // peek() method does not throw exception
        if(head == null){
            System.out.println("Queue is empty");
            return;
        }
        Node temp=head ;
        while(temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {

        My_Queue on = new My_Queue();

        on.enqueue(4);
       // on.enqueue(4);
        on.dequeue();
        on.peek();





    }


}
