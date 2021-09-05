package Math.logic;
import java.util.*;
public class distanceBetweentwo {
    static double distance(int x1,int y1,int x2,int y2){
      
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

    }
     public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
         System.out.print("Enter x1 :");
         int x1=inp.nextInt();
         System.out.print("Enter y1 :");
         int y1=inp.nextInt();
         System.out.print("Enter x2 :");
         int x2=inp.nextInt();
         System.out.print("Enter y2 :");
         int y2=inp.nextInt();
         System.out.println(distance(x1,y1,x2,y2));
         inp.close();
         
     }
    
}
