package Math.Fibonacci;
import java.util.*;
public class fibonacci {
    private int fibo(int limit){
        if(limit==0) return 0;
        if(limit==1 || limit==2) return 1;
        return fibo(limit-1)+fibo(limit-2);

    }
    private void fiboSeries(int newLimit){
      int start=0;
      while(start<=newLimit){
            System.out.print(fibo(start)+" ");
            start++;
      }
    }

    public static void main(String[] args) {
        fibonacci ref=new fibonacci();
        Scanner key=new Scanner(System.in);
        System.out.println("Enter limit :");
        int limit=key.nextInt();
        // System.out.println(ref.fibo(limit));
        ref.fiboSeries(limit);


    }
    
}
