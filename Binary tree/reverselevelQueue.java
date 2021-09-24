import java.util.*;
public class reverselevelQueue extends heightOftree{
    static heightOftree obj=new heightOftree();
    static void rev(Node root){
        // int height=obj.height(root);
        Queue<Node> queue=new LinkedList<Node>();
        Stack<Integer> stack=new Stack<Integer>();
       queue.add(root);
       while(!queue.isEmpty()){
           Node temp=queue.poll();
           stack.push(temp.data);
           if(temp.left!=null){
               queue.add(temp.left);
           }
           if(temp.right!=null){
               queue.add(temp.right);
           }
       }
       while(!stack.isEmpty()){
           System.out.println(stack.pop());
       }

    }
   
    public static void main(String[] args) {
        Node root=obj.create(3);
        root.left=obj.create(5);
        root.right=obj.create(6);
        root.right.left=obj.create(9); 
        rev(root);
        double n=0;
        if(n==0){
            System.out.println(1*Math.pow(10, n));
        }
        
    }
    
}
