package Math.Circle;
import java.util.*;
class Circle{
    final static double pi=3.14;
    private double areaCircle(int radius){
             return pi*radius*radius;
    }
    public static void main(String[] args){
         Circle area=new Circle();
         Scanner key=new Scanner(System.in);
         int radius=key.nextInt();
        
         System.out.println(area.areaCircle(radius));
         System.out.print("Want to find its perimeter ?\n");
         System.out.println("If yes input 1 else type any key ");
         
         try{
            int choice =key.nextInt();
            if(choice==1){
                double perim=2*pi*radius;
                System.out.println("Perimeter :"+perim);

            }
            else{
                key.close();
                return;
            }
         }
         catch (Exception e){
            System.out.println("Thanks....");
            key.close();
         }
         key.close();
    }
}