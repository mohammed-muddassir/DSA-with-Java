package Math.logic;
import java.util.*;
public class sumTillzero {
    static void tillZero(Scanner inp){
        int num,sum=0;
        System.out.print("Enter number :");
        do{
            num=inp.nextInt();
            sum+=num;
        }while(num!=0);
        System.out.println("Sum is :"+sum);
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        tillZero(inp);
        

    }
}
