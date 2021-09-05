package Math.logic;
import java.util.*;

import Math.head;
class subProdofTwo extends head{
    static int func(int n){
        int sum=0,prod=1,temp;
        while(n>0){
            temp=n%10;
            sum+=temp;
            prod*=temp;
            n/=10;
        }
        return prod-sum;
    }
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number :");
        int number=inp.nextInt();
        System.out.println(func(number));
        inp.close();

        
    }
}