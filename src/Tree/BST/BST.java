package Tree.BST;

public class BST {

    //  BST operations search,insert,delete

    public Node insert(Node root,int x){
        if(root == null){
            return new Node(x);
        }
        if(x < root.data){
            root.left=insert(root.left,x);
        }
        if(x > root.data){
            root.right=insert(root.right,x);
        }
        return root;
    }
    public boolean searchBST(Node root,int x){
        if(root==null){
            return false;
        }
        if(x<root.data) {
            return  searchBST(root.left, x);
        }
        if(x>root.data){
            return searchBST(root.right,x);
        }
        return true;

    }
    public boolean iterativeSearch(Node root,int x){
        if(root==null){
            return false;
        }
        Node current = root;
        while(current!=null){
            if(current.data==x){
                return true;
            }
            if(x>current.data){
                current=current.right;
            }
            else if(x<current.data ){
                current=current.left;
            }
        }
        return false;

    }
    public void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }


    public Node iterativeInsert(Node root,int x){
        Node temp=new Node(x);

        if(root==null){
            return temp;
        }

        Node current=root;
        Node parent=null;
        while(current!=null){
            parent=current;
            if(x>current.data){
                current=current.right;
            }
            else if(x<current.data){
                current=current.left;
            }
            else{
                return root;
            }
        }
        if(x>parent.data){
            parent.right=temp;
        }
        if(x<parent.data){
            parent.left=temp;
        }
        return root;

    }

    public Node delete(Node root,int x){
        if(root==null){
            return null;
        }
        if(x>root.data){
            root.right=delete(root.right,x);
        }
        else if(x<root.data){
            root.left=delete(root.left,x);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            else{
                Node successor = getSuccessor(root);
                root.data=successor.data;
                root.right=delete(root.right, successor.data);
            }
        }
        return root;
    }
    public Node getSuccessor(Node root){
        Node current = root.right;
        while(current!=null && current.left!=null){
            current=current.left;
        }
        return current;
    }

    public static void main(String[] args) {
        BST ob = new BST();
        Node root = new Node(4);

        ob.insert(root,3);
        ob.insert(root,7);
        ob.insert(root,2);
        ob.iterativeInsert(root,9);
        ob.iterativeInsert(root,6);

        System.out.println(ob.iterativeSearch(root,6));

        ob.delete(root,7);


        ob.inorder(root);


    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data=d;
    }
}
