public class leftView extends heightOftree{
    static heightOftree obj=new heightOftree();
    static void left(Node root){
        int height=obj.height(root);
        
    }

    public static void main(String[] args) {
        Node root=obj.create(3);
        root.left=obj.create(5);
        root.right=obj.create(6);
        root.right.left=obj.create(9); 
        left(root);
        
    }
}
