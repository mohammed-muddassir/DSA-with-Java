import java.util.*;
public class discountCalculator {
    static double calcDiscount(double price,int discount){
        double temp;
        if(price >=10 && price<100){
            temp=(int)price/10;
            temp=temp*(double)discount/10;
            return price-temp;
        }
        else if(price>=100){
            temp=(int)price/100;
            temp=temp*discount;
            return price-temp;
        }
        return price;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the price :");
        double price = inp.nextDouble();
        System.out.println("Enter discount price :");
        int discount=inp.nextInt();
        System.out.println("Discount is :"+calcDiscount(price,discount));
        
    }
    
}
