package DataStructures.Tree;

public class AVL {
    public int getMax(int a,int b){
        return a>b?a:b;
    }
    public int height(Node n){
        if(n==null){
            return 0;
        }
        return n.height;
    }
    public int BalanceFactor(Node n){
        if(n==null){
            return 0;
        }
        return height(n.left)-height(n.right);
    }
    public Node Insert(int k,Node root) {
        if (root == null) {
            return new Node(k);
        }
        if (k > root.data) {
            root.right = Insert(k, root.right);
        } else if (k < root.data) {
            root.left = Insert(k, root.left);
        } else {
            return root;
        }
        root.height = getMax(height(root.left), height(root.right)) + 1;
        int bf = BalanceFactor(root);
        if (bf > 1) {
            if (k < root.left.data) {
                return rightRotate(root);
            }
            else if (k > root.data) {
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
        }
        if (bf < -1)
            if (k > root.data) {
                return leftRotate(root);
            }

            return root;
    }
    public Node rightRotate(Node x){
        Node y=x.left;
        Node T2=y.right;
        y.right=x;
        x.left=T2;

        x.height=getMax(height(x.left),height(x.right))+1;
        y.height=getMax(height(y.left),height(y.right))+1;
        return y;

    }
    public Node leftRotate(Node y){
        Node x=y.right;
        Node T2=x.left;

        x.left=y;
        y.right=T2;
        x.height=getMax(height(x.left),height(x.right))+1;
        y.height=getMax(height(y.left),height(y.right))+1;
        return x;
    }
}
class Node{
    int height;
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        height=1;
    }
}
