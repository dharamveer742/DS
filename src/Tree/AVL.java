package Tree;

public class AVL{
    int getHeight(NodeA node){
        if(node==null){
            return 0;
        }
        return node.height;
    }
    int bf(NodeA node){
        if(node==null){
            return 0;
        }
        return getHeight(node.left)-getHeight(node.right);
    }
    public NodeA Insertion(NodeA root,int x){
        if(root==null){
            return new NodeA(x);
        }
        if(x>root.data){
            root.right=Insertion(root.right,x);
        }
        else if(x<root.data){
            root.left=Insertion(root.left,x);
        }
        else{
            return root;
        }
        root.height=Math.max(getHeight(root.left),getHeight(root.right))+1;
        int balance=bf(root);
        // Left left case
        if(balance>1 && x<root.left.data){
            return rightRotate(root);
        }
        // left right case
        else if(balance >1 && x>root.left.data){
            root.left=leftRotate(root.left);
            return rightRotate(root);
        }
        // right left case
        else if(balance<-1 && x<root.right.data){
            root.right=rightRotate(root.right);
            return leftRotate(root);

        }
        // Right right case
        else if(balance<-1 && x>root.right.data){
            return leftRotate(root);
        }
        return root;

    }
    NodeA rightRotate(NodeA root){
        NodeA y=root.left;
        NodeA T2=y.right;

        y.right=root;
        root.left=T2;

        root.height=Math.max(getHeight(root.left),getHeight(root.right))+1;
        y.height=Math.max(getHeight(y.left),getHeight(y.right))+1;

        return y;
    }
    NodeA leftRotate(NodeA root){
        NodeA x=root.right;
        NodeA T2=x.left;

        x.left=root;
        root.right=T2;

        root.height=Math.max(getHeight(root.left),getHeight(root.right))+1;
        x.height=Math.max(getHeight(x.left),getHeight(x.right))+1;

        return x;
    }
    public void Inorder(NodeA root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }

    public static void main(String[] args) {
        AVL ob = new AVL();


        NodeA root=new NodeA(13);
        ob.Insertion(root,10);
        ob.Insertion(root,15);
        ob.Insertion(root,5);
        ob.Insertion(root,11);
        ob.Insertion(root,16);
        ob.Insertion(root,4);
        ob.Insertion(root,8);
        ob.Insertion(root,3);
        ob.Inorder(root);

    }



}
class NodeA{
    int data;
    int height;
    NodeA right;
    NodeA left;
    NodeA(int value){
        data=value;
        height=1;
    }
}

