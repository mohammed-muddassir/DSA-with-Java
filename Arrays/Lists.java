import java.io.*;
// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import jdk.internal.org.jline.utils.InputStreamReader;
import java.util.*;

// import org.graalvm.compiler.nodes.calc.IntegerDivRemNode;
public class Lists {
   public static void main(String[] args) throws IOException{
       BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
       ArrayList<Integer> list=new ArrayList<Integer>();
       int n=Integer.parseInt(inp.readLine());
       int[] arr=new int[2];
       String[] str;
       str=inp.readLine().split(" ");
       for(int i=0;i<n;i++){
           int a=Integer.parseInt(str[i]);
            list.add(a);
            
       }
    //    list.add(4,23);
    //    str=null;
    // System.out.println(list.size());
       ListIterator<Integer> obj=list.listIterator();
       BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        int second=Integer.parseInt(key.readLine());
        for(int i=0;i<second;i++){
            String query=key.readLine();
            if(query.equals("Insert")){
                String[] in=new String[2];
                in=key.readLine().split(" ");
                for(int j=0;j<2;j++){
                    arr[j]=Integer.parseInt(in[j]);
                    
                }
                int d=arr[0];
                int k=arr[1];
                if(d>=n){
                    list.add(k);

                }
                else{
                    list.add(d, k);
                }
              
               
              
            }
            if(query.equals("Delete")){
               
                int del=Integer.parseInt(key.readLine());
                list.remove(del);

            }
            
        }
        
        int[] my = list.stream().mapToInt(i -> i).toArray();
        for(int k:my){
            System.out.println(k);
        }

        
   
   } 
}
