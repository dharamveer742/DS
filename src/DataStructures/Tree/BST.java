package DataStructures.Tree;

public class BST {

    public static node insert(node root,int x){
        if(root==null){
            return new node(x);
        }
        if(x>root.data){
            root.right=insert(root.right,x);
        }
        else if(x<root.data){
            root.left=insert(root.left,x);
        }
        return root;
    }
    public static boolean search(node root,int x){
        if(root==null){
            return false;
        }
        if(x<root.data){
            return search(root.left,x);
        }
        if(x>root.data){
            return search(root.right,x);
        }
        return true;
    }
    public static node delete(node root,int x){
        if(x> root.data){
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
                node successor=getSuccessor( root);
                root.data=successor.data;
                root.right=delete(root.right,successor.data);
            }
        }
        return root;


    }
    public static void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static node  getSuccessor(node root){
        node current=root.right;
        while(current!=null && current.left!=null){
            current =current.left;
        }
        return current;
    }


    public static void main(String[] args) {
        node root =new node(5);
        insert(root,8);
        insert(root,4);
        insert(root,12);
        inorder(root);

        delete(root,4);
        System.out.println(search(root,4));
        System.out.println("After");
        inorder(root);
    }

}
class node{
    int data;
    node left;
    node right;
    node(int value){
        data=value;
    }

}
