import java.util.*;
public class ypos {
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.println("enter loop length :");
        int list1Len=inp.nextInt();
        // List<Integer> l=new ArrayList<>();
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>(list1Len);
       
        for(int i=0;i<list1Len;i++){
            System.out.println("enter inner loop length:");
            int inner=inp.nextInt();
            list.add(new ArrayList<Integer>());
            for(int j=0;j<inner;j++){
                int input=inp.nextInt();
                list.get(i).add(j, input);

            }
            
        }
        System.out.println(list);
        int sec=inp.nextInt();
        for(int k=0;k<sec;k++){
            System.out.println("first index :");
            int first=inp.nextInt();
            System.out.println("second index :");
            int second=inp.nextInt();
            System.out.println("value :");
            try{
                System.out.println(list.get(first-1).get(second-1));
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Error!");
            }
            
        }
        
    }
}
