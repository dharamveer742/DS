package Practise;

public class DoublyLinkedbyTail {

    Student head;
    Student tail;

    class Student{
        int data;
        Student next;
        Student prev;

        Student(int d){
            data=d;
            next =null;
            prev=null;
        }
    }

    public void addLast(int n ){
        Student ne = new Student(n);
        if(head==null){
            head=tail=ne;
            return ;
        }
        tail.next=ne;
        ne.prev=tail;
        tail=ne;

    }

    public void addFirst(int n){
        Student s = new Student(n);
        if(head==null){
            System.out.println("Empty");
            return ;
        }
        s.next=head;
        head.prev=s;
        head=s;
    }
    public void deleteFirst(){

        if(head==null || tail==null){
            System.out.println("Empty");
            return ;
        }

        head=head.next;
        head.prev=null;
    }
    public void deleteLast(){
        if(head==null || tail==null){
            System.out.println("Empty");
            return;
        }
        Student temp=tail.prev;
        temp.next=null;
        tail.prev=null;
        tail=temp;
    }

    public void Traverse(){
        if(head==null || tail==null){
            System.out.println("Empty");
            return;
        }
        Student current = head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }

    }

    public static void main(String[] args){

        DoublyLinkedbyTail i = new DoublyLinkedbyTail();
        i.addLast(7);
        i.addLast(8);
        i.addLast(9);
        i.deleteLast();
        i.addFirst(6);
        i.deleteFirst();
        i.Traverse();



    }







}
