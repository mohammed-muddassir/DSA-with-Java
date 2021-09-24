class Nodenew{
    int data;
    Nodenew left;
    Nodenew right;
}

public class subOftree{
    public Nodenew create(int v){
        Nodenew node=new Nodenew();
        node.data=v;
        node.left=null;
        node.right=null;
        return node;
    }
    
    public int sub(Nodenew node){
        if(node==null){ //if the node is null
            return 0;
        }
        return node.data-sub(node.left)-sub(node.right);
         
    
    }

    public static void main(String[] args) {
        subOftree obj=new subOftree();
        Nodenew root=obj.create(2);
        root.left=obj.create(3);
        root.right=obj.create(4);
        // root.left.left=obj.create(3);
        // root.right.right=obj.create(4);
        System.out.println(obj.sub(root));
    }
}