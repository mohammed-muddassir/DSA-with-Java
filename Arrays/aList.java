
import java.util.*;
public class aList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(i);
        }
        list.add(7,9879);
        for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
    }
}
