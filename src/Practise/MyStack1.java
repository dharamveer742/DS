
// Implementation of stack using linkedList

package Practise;

public class MyStack1 {
    Stacknode top ;

    class Stacknode {
        int value;
       Stacknode next;

        Stacknode(int data) {
            next = null;
            this.value = data;
        }
    }

        public void push(int data){
            Stacknode ne = new Stacknode(data);
            ne.next=top;
            top=ne;
            System.out.println("Data inserted "+ data);
        }

        public boolean  empty(){
        return top==null;

        }
        public int peek() {
            if(top==null){
                System.out.println("Empty stack");
                return -1;
            }
            int res = top.value;
            return res;

        }
        public int pop(){
            if(top==null){
                System.out.println("Empty stack");
                return -1;

            }
            int res =top.value;
            top=top.next;
            return res;
        }

        public static void main(String[] args) {
            MyStack1 ov = new MyStack1();
              ov.push(4);
              ov.push(44);
              ov.push(9);


            System.out.println(ov.peek());


            System.out.println(ov.pop());
            System.out.println(ov.pop());
            System.out.println(ov.pop());

            System.out.println(ov.peek());

            System.out.println(ov.peek());


        }








}
