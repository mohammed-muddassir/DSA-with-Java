public class reverseLevel extends heightOftree{
    static void print(Node node,int j){
        if(node==null) return;
        
        if(j==1) {
            System.out.println(node.data);
            return;
        }
        print(node.left, j-1);
        print(node.right,j-1);

    }
    static heightOftree obj=new heightOftree();
    public static void reverse(Node node){
        int height=obj.height(node);
        System.out.println(height);
        for(int i=height;i>0;i--){
            print(node,i);
          

        }
    }
    public static void main(String[] args) {
       
        Node root=obj.create(3);
        root.left=obj.create(5);
        root.right=obj.create(6);
        root.right.left=obj.create(9);
        reverse(root);


        
    }
}
