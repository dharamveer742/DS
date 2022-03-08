package Practise;

public class DoublyLinked {
    Student head;


    class Student{
        int data;
        Student next;
        Student prev;

        Student(int d){
            data=d;

        }
    }
    public void addFirst(int d){
        Student ne = new Student(d);
        if(head==null){
            head=ne;
            return;
        }

        ne.next=head;
        head.prev=ne;
        head=ne;
    }
    public void addLast(int d){
        Student ne = new Student(d);
        if(head==null){
            head=ne;
            return;
        }
        Student  current = head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=ne;
        ne.prev=current;


    }


    public void Traverse(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Student temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void TraverseRev(){
        if(head==null){
            System.out.println("empty");
            return;
        }
        Student count =head;

        while(count.next!=null){
            count=count.next;
        }
        while(count!=null){
            System.out.println(count.data);
            count=count.prev;
        }
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("empty list");
            return;
        }
        head.prev=null;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }

        Student temp= head;
        Student current = head.next;
        while(current.next!=null){
            temp=current;
           current = current.next;
        }
        temp.next=null;
        current.prev=null;

    }


    public static void main(String[] args) {
        DoublyLinked c = new DoublyLinked();
        c.addLast(5);
        c.addFirst(4);
       /* c.addLast(6);
        c.addLast(9);
        c.addLast(10);
        c.deleteLast();
        c.deleteLast();*/

        c.Traverse();
        c.deleteLast();
        c.deleteLast();
        c.deleteLast();

        System.out.println();
        c.Traverse();
        System.out.println();
        c.deleteLast();
        c.TraverseRev();






    }



}
