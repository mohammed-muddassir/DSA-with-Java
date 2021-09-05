package Math.Rectangle;
import java.util.*;
public class areaOfRectangle {
    public static void main(String[] args){
        areaOfRectangle area=new areaOfRectangle();
        Scanner key=new Scanner(System.in);
        double length=key.nextDouble();
        double breadth=key.nextDouble();
        System.out.println("area :" +length*breadth);
        System.out.println("want to find the perimeter of it?");
        System.out.println("If yes, input 1 else type any key :");
        try{
            int choice =key.nextInt();
            if(choice==1){
                System.out.println("thanks....");
                System.out.println("Enter width :");
                double width=key.nextInt();
                double perimeter=2*(length+width);
                System.out.println("Perimeter :"+perimeter);
            }
            else{
                System.out.println("Thankyouuu");
                key.close();
                return;
            }
        }
        catch(Exception e){
            System.out.println("Thankyouuu");
        }
        key.close();

    }
    
}
