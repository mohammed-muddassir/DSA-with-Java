class Node{
    int data;
    Node left;
    Node right;
}

public class creatingTree{
    public void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        System.out.println(node.data);
        inorder(node.right);
    }

    public Node create(int v){
        Node node=new Node();
        node.data=v;
        node.left=null;
        node.right=null;
        return node;
    }


}