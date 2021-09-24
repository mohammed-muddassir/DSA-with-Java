public class insertionAtsorted extends list{
   
    public insertionAtsorted(int data, list next) {
        super(data, next);
        //TODO Auto-generated constructor stub
    }
    static void insert(list start,int x){
        list t=start;
        list new_node=new list(x);
        while(t.next!=null){
            if(t.next.data>x){
                break;
            }
            t=t.next;
        }
        
        new_node.next=t.next;
        t.next=new_node;
       



        
    }

    public static void main(String[] args) {
        int x=50;
        list start=new list(22);
        list temp=start;
        for(int i=0;i<6;i++){
            temp=temp.next=new list(22+11*i);
        }
        insert(start,x);
        for(list tem=start;tem!=null;tem=tem.next){
            System.out.println(tem.data);
        }


    }
}
