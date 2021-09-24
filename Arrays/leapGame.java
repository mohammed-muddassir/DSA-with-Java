import java.util.*;
public class leapGame {
    public static void main(String[] args) {
        int[] arr={0,0,0,0};
        int n=arr.length;
        int leap=1;
        boolean result;
        if(leap==n-1 && arr[0]+arr[1]==0){
            System.out.println("true");
            return;
        }
        int i;
        for(i=0;i<n-leap+1;){
            if(arr[i]==1){
                System.out.println("false");
                break;
            }
            if(arr[i]+arr[i+1]==0){
                if(i+(i+leap)==n){
                    System.out.println("true");
                    break;
                }
                if(arr[i]+arr[i+leap]==0){
                    i=i+leap;
                }
                i++;

            }
            else if(arr[i]+arr[i+1]==1){
                if(i+(i+leap)==n){
                    System.out.println("true");
                    break;
                }
                else if(arr[i]+arr[i+leap]==0){
                    i=i+leap;
                }
                else{
                    System.out.println("false");
                    break;

                }
                

            }
            
        }
     
       for(int j=i;j<n;j++){
           System.out.println(j);
            if(arr[j]==1){
                System.out.println("false");
                return;
            }
            else if(arr[j]+arr[j+1]==1 && j+1==n-1){
                System.out.println("false");
                return;

            }
            else if(j==n-1){
                System.out.println("true");
                return;
            }

       }
       System.out.println("true");

        
    
    }
}
