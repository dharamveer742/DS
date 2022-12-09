/* LinkedList Implementation of binary tree and traversals
   In binary Tree every node  has at most 2 children  */


// *******************  STACK APPLICATIONS REMAINING ******************



package DataStructures.Tree;
import java.util.*;

class BinaryNode{
    int data;                           //  Node for Binary tree
    BinaryNode left;
    BinaryNode right;

    BinaryNode(int value) {
        this.data = value;

    }
}

 public class BinaryTree {

    // Depth first traversals

    public void preOrder(BinaryNode node){
        if(node==null ){ return ; }
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public void postOrder(BinaryNode node ){
        if(node==null ){ return ; }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");

    }
    public void inOrder(BinaryNode node ){
        if(node==null ){ return ; }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);

    }
    public int height(BinaryNode node){
        if(node==null){   //     8
            return 0;
        }
        int l = height(node.left);
        int r = height(node.right);
        int h=Math.max(l,r)+1;

        return h;
    }
    public void kprint(BinaryNode node,int k){
        if(node==null){
            return ;
        }
        if(k==0){
            System.out.print(node.data+" ");
        }
        kprint(node.left,k-1);
        kprint(node.right,k-1);

    }
    public void LOT(BinaryNode root ){
        Queue<BinaryNode> Queue = new LinkedList<>();
        Queue.offer(root);
        while (!Queue.isEmpty()){
            BinaryNode current = Queue.poll();
            if(current.left!=null){
                Queue.offer(current.left);
            }
            if(current.right!=null){
                Queue.offer(current.right);
            }
            System.out.print(current.data+" ");
        }


    }
    public int count(BinaryNode root){  // 1   30
        if(root==null){
            return 0;
        }
        return count(root.left)+count(root.right)+1;
    }
    public void Serialize(ArrayList<Integer> arr,BinaryNode root){
        if(root==null){
            arr.add(-1);
        }
        else
        {
        arr.add(root.data);
        Serialize(arr,root.left);
        Serialize(arr,root.right);
        }
        return ;
    }
    public void Iinorder(BinaryNode root){
        BinaryNode current=root;
        Stack<BinaryNode> s = new Stack<>();
        while(current!=null || !s.isEmpty()){
            while(current!=null){
                s.push(current);
                current=current.left;
            }
            current=s.pop();
            System.out.print(current.data+" ");
            current=current.right;
        }


    }

}

class operations {
    public static void main(String[] args) {
        BinaryNode n1 = new BinaryNode(10);
        BinaryNode n2 = new BinaryNode(8);
        BinaryNode n3 = new BinaryNode(30);     // complete binary tree
        BinaryNode n4 = new BinaryNode(40);
        BinaryNode n5 = new BinaryNode (50);


        n1.left=n2;
        n1.right=n3;
        n3.left=n4;
        n3.right=n5;

        BinaryTree T =new BinaryTree();

       /* System.out.println(" PreOrder Traversal is ");
        T.preOrder(n1);
        System.out.println("\n postOrder Traversal is ");
        T.postOrder(n1); */
        System.out.println("\ninOrder Traversal is ");
        T.inOrder(n1);
        System.out.println("Height of tree is ");
        System.out.println(T.height(n1));

        System.out.println("Nodes at kth position are");
        T.kprint(n1,2);
        System.out.println("Level order traversal is ");
        T.LOT(n1);

        System.out.println("no of of nodes in tree tre");
        System.out.println(T.count(n1));


        ArrayList<Integer> ar = new ArrayList<>();
        System.out.println("Serialization is");
        T.Serialize(ar,n1);
        System.out.println(ar); //  10, 8, -1, -1, 30, 40, -1, -1, 50, -1, -1
        System.out.println("Iterative inorderr  is");
        T.Iinorder(n1);

    }
}














