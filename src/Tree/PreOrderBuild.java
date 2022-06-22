package Tree;
public class PreOrderBuild {
    static int index=-1;
    static Node preorder(int[] arr){  // {1,2,4,-1,-1,5}

        index++;
        if(index==arr.length){
            return null;
        }
        if(arr[index]==-1 ){
            return null;
        }
        Node ne = new Node(arr[index]);
        ne.left=preorder(arr);
        ne.right=preorder(arr);
        return ne;
    }

    public static void main(String[] args) {
        int[] Nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=preorder(Nodes);
        System.out.println(root.data);
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
    }
}
