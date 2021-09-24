package DoublyLinkedlist;

public class atPostion extends insertion{
    public static void main(String[] args) {
        insertion ob=new insertion();
        node h=null;
        h=ob.insert(23,h);
        h=ob.insert(21,h);
        h=ob.insert(19,h);
        h=ob.append(30, h);
        h=ob.insert(27,h,5);
        ob.print(h);
    }
    
}
