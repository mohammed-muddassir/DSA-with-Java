import java.util.*;
import java.io.*;

public class hourglass {
    public static void main(String[] args) {
        List<Integer> sum=new ArrayList<Integer>();
        int[] ar={1,2,3};
        int[] sam=ar.clone();
        int[][] 
        arr={
            {1,1,1,0,0,0},
            {0,1,0,0,0,0},
            {1,1,1,0,0,0},
            {0,0,2,4,4,0},
            {0,0,0,2,0,0},
            {0,0,1,2,4,0},
            
        };
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                        arr[i+1][j+1]+
                        arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
            }   
        }
        System.out.println(Collections.max(sum));



    }
}
