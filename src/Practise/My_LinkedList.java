// Java program to traverse,size,insert,delete an node in linked list

package Practise;

import java.util.Scanner;

public class My_LinkedList {
    Node head;

    static class Node {
        int roll_no;
        Node next;

        Node(int roll_no) {
            this.roll_no = roll_no;
            next = null;
        }
    }

    public void AddFirst(int roll_no) {
        Node ne = new Node(roll_no);
        ne.next = head;
        head = ne;
    }

    public void AddLast(int roll_no) {
        Node ne = new Node(roll_no);
        Node current = head;
        if (head == null) {
            head = ne;
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = ne;
    }

    public void Add(int pos, int roll_no) {
        Node ne = new Node(roll_no);
        if (head == null) {
            if (pos == 0) {
                head = ne;
                return;
            } else {
                return;
            }
        }
        if (head != null && pos == 0) {
            ne.next = head;
            head = ne;
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }
        Node next = temp.next;
        ne.next = next;
        temp.next = ne;

    }


   /*   public void add(int index,int roll_no){
         Node ne = new Node(roll_no);
         if(head==null){
             if(index==0){
                 head=ne;
                 return;
             }
             else{
                 System.out.println("wrong Index");
                 return;
             }

         }
         if(head!=null && index==0){
             ne.next=head;
             head=ne;
             return;
         }

         Node current =head;
         Node prev=null;

         int i=0;
         while(i<index){
             prev=current;
             current=current.next;
             if(current==null){
                 break;
             }
             i++;
         }
         ne.next=current;
         prev.next=ne;

     }

   */

    public void DeleteFirst() {
        if (head == null) {
            System.out.println("List is empty can't delete");
            return;
        }
        head = head.next;
    }

    public void DeleteLast() {
        if (head == null) {
            System.out.println("List is empty can't delete");
            return;
        }
        if (head.next == null) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }


    public void Delete(int pos) {
        if (head == null) {
            return;
        }
        if (head != null && pos == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {    // if position is greater then the size  = temp!=null
            temp = temp.next;

        }
        if (temp == null || temp.next == null) {  // temp = jus prev node than position and temp.next=node at the given position
            System.out.println("wrong position no node at this pos to delete");  // which we have to delete
            return;
        }
        Node next = temp.next.next;
        temp.next = next;

    }

    public void ListSize() {
        if (head == null) {
            System.out.println("Empty" + " 0");
            return;
        }
        int size = 0;
        Node current = head;
        while (current != null) {
            size += 1;
            current = current.next;
        }
        System.out.println(size);
    }

    public void TraverseList(Node b) {
         head = b;
        if (head == null) {
            System.out.println(" List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.roll_no);
            current = current.next;
        }
        System.out.println("null");
    }


    public Node reverse(Node head) {
        Node pre = null;
        Node curr = head;
        while (curr!= null) {
            Node next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        Node c = pre;
        return c;


    }


    public static void main(String[] args) {
        My_LinkedList List = new My_LinkedList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 1 to add an element in the starting of  a List");
            System.out.println("Enter 2 to add an element in the last of  a List");
            System.out.println("press 3 to add an element at a given position in the list");
            System.out.println("Enter 4 to get the size of list");
            System.out.println("Enter 5 to delete an element in starting of the List");
            System.out.println("Enter 6 to delete last element of the List");
            System.out.println("Enter 7 to delete the element at a given position of list ");
            System.out.println("Press 8 to traverse the list  ");
            System.out.println("Press 9 to traverse the linkedList in reverse order");
            System.out.println("Press 10 to exit from menu");
            System.out.println();


            System.out.println("Enter the choice ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> List.AddFirst(sc.nextInt());
                case 2 -> List.AddLast(sc.nextInt());
                case 3 -> List.Add(sc.nextInt(), sc.nextInt());
                case 4 -> List.ListSize();
                case 5 -> List.DeleteFirst();
                case 6 -> List.DeleteLast();
                case 7 -> List.Delete(sc.nextInt());
                case 8 -> List.TraverseList(List.head);
                case 9 -> List.TraverseList(List.reverse(List.head));
                case 10 -> System.exit(0);
                default -> System.out.println("Wrong choice");
            }

            List.TraverseList(List.reverse(List.head));


        }
    }


}


