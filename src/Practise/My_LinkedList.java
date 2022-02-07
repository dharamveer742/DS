package Practise;

public class My_LinkedList {
    Node head;
     static class Node {
        int roll_no;
        Node next;

        Node(int roll_no) {
            this.roll_no = roll_no;
            next=null;
        }

    }

    public void AddFirst(int roll_no){
        Node ne = new Node(roll_no);
        ne.next=head;
        head=ne;

    }

    public void AddLast(int roll_no){
         Node ne = new Node(roll_no);
         Node current=head;
         if(head==null){
             head=ne;
             return;
         }
         while(current.next!=null){
             current = current.next;
         }
         current.next=ne;
     }

   /*  public void add(int index,int roll_no){
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

     }   */



     public void add(int roll_no ,int pos){
        Node ne= new Node(roll_no);
        if(head==null ){
            if(pos==0){
                head =ne;
                return ;
            }
            else{
                return;
            }
        }
        if(head!=null && pos==0){
            ne.next= head;
            head =ne;
            return ;
        }

        Node temp=head;
        for(int i=0;i<pos-1 && temp!=null; i++){
            temp=temp.next;
        }
        if(temp==null){
            return;
        }
        Node next=temp.next;
        ne.next=next;
        temp.next=ne;

    }

    public void delete(int pos){
         if(head==null){
             return ;
         }
         if(head!=null && pos ==0){
             head=head.next;
             return ;
         }

         Node temp=head;
         for(int i=0;i<pos-1 && temp!=null;i++){    // if position is greater then the size  = temp!=null
             temp=temp.next;

         }
         if(temp==null || temp.next==null){  // temp = jus prev node than position and temp.next=node at the given position
             System.out.println("wrong position no node at this pos to delete");  // which we have to delete
             return;
         }
         Node next =temp.next.next;
         temp.next=next;

     }





     public void DeleteFirst(){
         if(head==null){
             System.out.println("List is empty can't delete");
             return;
         }
         head=head.next;
     }
     public void DeleteLast(){
         if(head==null){
             System.out.println("List is empty can't delete");
             return ;
         }
         if(head.next==null){
             head = head.next ;
             return;
         }
         Node current=head;
         while(current.next.next!=null){
             current= current.next;
         }
         current.next=null;
     }

     public void ListSize(){
         if(head==null){
             System.out.println("Empty"+" 0");
             return;
         }
         int size=0;
         Node current=head;
         while(current!=null){
             size+=1;
             current=current.next;
         }
         System.out.println(size);
     }

    public void TraverseList()
    {
         if(head==null)
         {
             System.out.println(" List is empty");
             return;
         }
         Node current = head ;
         while(current!=null){
             System.out.println(current.roll_no);
             current = current.next;
         }
    }


    public static void main(String[] args)
    {
        My_LinkedList L1 = new My_LinkedList();

        L1.AddLast(6);
        L1.AddFirst(5);
        L1.AddLast(7);
        L1.AddLast(8);
        L1.DeleteLast();
        L1.TraverseList();
        System.out.println("size is");
        L1.ListSize();
        System.out.println();
        L1.add(58,2);
        L1.TraverseList();
        L1.delete(1);
        L1.TraverseList();
     }

}
