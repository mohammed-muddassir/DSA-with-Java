package DoublyLinkedlist;

public class front extends insertion{
    public static void main(String[] args) {
        insertion obj=new insertion();
        node head=null;
        head=obj.insert(23,head);
        head=obj.insert(21,head);
        head=obj.insert(19,head);
        head=obj.append(30, head);
        obj.print(head);
    }
}
