package Math.logic;
import java.util.*;
public class maxTillZero {
    static int maxUntil(Scanner inp){
        int n,max=Integer.MIN_VALUE;
        do{
            n=inp.nextInt();
            if(n>max){
                max=n;
            }

        }while(n!=0);
        return max;

    }
    public static void main(String[] args) {
        maxTillZero ref=new maxTillZero();
        Scanner inp=new Scanner(System.in);
        System.out.println("Max is :"+maxUntil(inp));

    }
    
}
