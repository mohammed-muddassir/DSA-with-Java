public class list {
    protected int data;
    protected list next; //reference
    public list(int data){
        this.data=data;
    }
    public list(int data,list next){
        this.data=data;
        this.next=next;
        
    }
    // public static void main(String[] args) {
      
    //     list start=new list(22);
    //     list p=start;
    //    for(int i=0;i<50;i++){
    //        p=p.next=new list(33+11*i);

    //    }
    //    for(list temp=start;temp!=null;temp=temp.next){
    //         System.out.println(temp.data);
    //    }
    //    System.out.println("finished.........");
    // }
}
