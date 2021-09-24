import java.util.*;
public class levelOrderTraverse extends creatingTree{
    public void levelOrder(Node node){
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            System.out.println(temp.data);
            if(temp.left!=null){
                queue.add(temp.left);
            }
            if(temp.right!=null){
                queue.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        creatingTree obj=new creatingTree();
        levelOrderTraverse ob=new levelOrderTraverse();
        Node root=obj.create(3);
        root.left=obj.create(5);
        root.right=obj.create(6);
        root.right.left=obj.create(9);
        ob.levelOrder(root);
        
    }
}