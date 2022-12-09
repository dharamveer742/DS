package linkedList;

public class CloneLinkedListRandom {
    public void duplicate(Node head){
        Node current =head;

        while(current!=null){
            Node temp=current.next;
            current.next= new  Node(current.val);
            current.next.next=temp;
            current =temp;
        }

    }
    public void random(Node head){
        Node current=head;
        while(current!=null){
            if(current.next!=null){
                current.next.random=(current.random!=null)?current.random.next:null;
            }
            current=current.next.next;
        }
    }
    public Node seperate(Node head){
        Node orig=head;
        Node copy = head.next;

        Node t1=copy;
        while(orig!=null){


            orig.next=orig.next.next;
            copy.next=(copy.next!=null)?copy.next.next:null;
            orig=orig.next;
            copy=copy.next;

        }
        return t1;
    }

}
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}