import java.io.IOException;
import java.util.*;
public class average {


    public static void main(String[] args) throws IOException {
        average obj=new average();
        Scanner inp=new Scanner(System.in);
        double input,avg,sum=0;
        int length=0;
        System.out.println("Enter your choice :");
        System.out.println("Print any number to execute and text to calculate :");
        do{
             input=inp.nextDouble();
             sum+=input;
             length++;
   
        }while(input>-5000);

    }
    //InputMismatchException
    
}
