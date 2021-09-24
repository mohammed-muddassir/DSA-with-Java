import java.util.*;
public class nonDec {
    static void finde(int[] arr,int len){
        int[] b=new int[len];
        
        for(int i=0;i<len;i++){
            if(i==0){
                b[i]=arr[i];
                System.out.print(b[i]+" ");
                // continue;
            }
            else if(arr[i]<=arr[i-1]){
                b[i]=(int)Math.ceil((b[i-1]+arr[i-1]/arr[i])*arr[i]);
                System.out.print(b[i]+" ");
            }
            // else if(arr[i]>arr[i-1]){
            //     // b[i]=(int)Math.ceil((b[i-1]/arr[i])*arr[i]);
            //     b[i]=arr[i];
            //     System.out.print(b[i]+" ");
            // }
            // else{
            //     b[i]=arr[i];
            //     System.out.print(b[i]+" ");
            // }
        }
    }
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int test=inp.nextInt();
        for(int i=0;i<test;i++){
            int len=inp.nextInt();
            int[] arr=new int[len];
            for(int j=0;j<len;j++){
                arr[j]=inp.nextInt();
                

            }
            finde(arr,len);
            
        }
        
    }
}
