public class leafNodes extends Node{
    public int leaf(Node node){
        if(node==null) return 0;
        if(node.left==null && node.right==null){
            return 1;
        }
        return leaf(node.left)+leaf(node.right);
    }

    public static void main(String[] args) {
        leafNodes last=new leafNodes();
        creatingTree obj=new creatingTree();
        Node root=obj.create(3);
        root.left=obj.create(5);
        root.right=obj.create(6);
        // obj.inorder(root);
        System.out.println(last.leaf(root));
        
        
    }
    
}
