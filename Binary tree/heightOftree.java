public class heightOftree extends creatingTree{
    public static Node root;

    public heightOftree(Node root) {
        heightOftree.root=root;

    }
    public heightOftree() {
    }
    public int height(Node node){
        if(node==null) return 0;
        if(node.left==null && node.right==null) return 1;
        return Math.max(1+height(node.left),1+height(node.right));
    }
    public static void main(String[] args) {
        creatingTree cr=new creatingTree();
       
        Node root=cr.create(3);
        root.left=cr.create(5);
        root.right=cr.create(6);
        root.left.left=cr.create(1);
        root.left.right=cr.create(2);
        root.right.left=cr.create(7);
        root.right.left.right=cr.create(4);
        heightOftree h=new heightOftree(root);
        System.out.println(h.height(root.right));
    }
    
}
