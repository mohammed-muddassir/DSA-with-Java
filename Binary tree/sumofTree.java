class U{
    int data;
    U left;
    U right;
}

public class sumofTree{
    public U create(int v){
        U node=new U();
        node.data=v;
        node.left=null;
        node.right=null;
        return node;
    }
    
    public int sum(U node){
        if(node==null){ //if the node iss null
            return 0;
        }
        return node.data+sum(node.left)+sum(node.right);
         
    
    }

    public static void main(String[] args) {
        sumofTree obj=new sumofTree();
        U root=obj.create(2);
        root.left=obj.create(3);
        root.right=obj.create(4);
        System.out.println(obj.sum(root));
    }
}