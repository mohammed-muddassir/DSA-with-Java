package Math.Triangle;
import java.util.*;
public class areaOfTriangle {
    
    final double half=2;
    private double areaTri(double base,double height){
         return (base*height)/half;
    }
    public static void main(String[] args){
        areaOfTriangle area=new areaOfTriangle();
        Scanner key=new Scanner(System.in);
        System.out.print("Enter Base :");
        double base=key.nextDouble();
        System.out.print("Enter height :");
        double height=key.nextDouble();
        System.out.println("Area of triangle is: "+area.areaTri(base,height));
        System.out.print("Want to find the perimeter of it ?\nIf yes Input 1 else type any key : ");
        
        try{

               int choice=key.nextInt();
               if(choice==1){
                System.out.println("thanks....");
                System.out.println("Enter length of sides...");
                System.out.print("Enter a :");
                double a=key.nextInt();
                System.out.print("Enter b :");
                double b=key.nextInt();
                System.out.print("Enter c :");
                double c=key.nextInt();
               
                System.out.println("Perimeter is :"+(a+b+c));
               }
               else{
                   key.close();
                   return;
               }
               

        }
        catch(Exception e){
            System.out.println("Thankyouu...");
        }
        key.close();



    }
    
}
