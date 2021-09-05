package Math.logic;
import java.util.*;
public class factorsOfNum {
    static void findFact(int num){
        int i;
        for(i=1;i<num;i++){
            if(num%i==0){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        //for eg num is 8 so facts are 1,2,4;
        findFact(num);
        inp.close();
    }
}
