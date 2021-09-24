package DoublyLinkedlist;
import java.util.*;
class node{
    int data;
    node prev;
    node next;
    node end;
    
}
// static node en;
public class insertion {
    public node getNew(int i,node n){
        node new_node=new node();
        new_node.data=i;
        new_node.next=null;
        new_node.prev=null;
        return new_node;
    }
    public node insert(int i,node Node){
        if(Node==null){
            return getNew(i, Node);
        }
        node head=Node;
        head.end=head;
        
        while(Node.next!=null){
            Node=Node.next;
        }
        node x=getNew(i,Node);
        x.prev=Node;
        Node.next=x;
        head.end=x;
        return head;

    }
    public node insert(int data,node head,int pos){
        int k=1;
        node h=head;
        node tem=head;
        if(head==null) return head;
        if(pos==1){
             return insert(data, head);
        }
        while((head!=null)&&(k<pos)){
            k++;
            tem=head;
            head=head.next;

        }
        if(head==null&& k==pos){
            node newN=getNew(data, h);
            newN.next=head;
            tem.next=newN;
            newN.prev=tem;
            return h;

        }
        else if(head==null&& k!=pos){
            System.out.println("not found");
            return h;
        }
        node newN=getNew(data, h);
        head.prev.next=newN;
        newN.prev=head.prev;
        head.prev=newN;
        newN.next=head;
      
       
        return h;
    }
    public void print(node head){
        for(node temp=head;temp!=null;temp=temp.next){
            System.out.println(temp.data);
        }
       
    }
    public node append(int d,node head){
        node temp=getNew(d, head);
        temp.next=head;
        temp.prev=null;
        head.prev=temp;
        head=temp;
        return head;
    }
    
    // public static void main(String[] args) {
    //     insertion obj=new insertion();
        // node head=null;
        // head=obj.insert(23,head);
        // head=obj.insert(21,head);
        // head=obj.insert(19,head);
        
    //     obj.print(head);
        
    // }
     // System.out.println(head.end.data);
        // for(node t=head.end;t!=null;t=t.prev){
        //     System.out.println(t.data);
        // }
        // System.out.println(head.end.data);
}
