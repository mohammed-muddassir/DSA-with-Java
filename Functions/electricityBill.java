import java.util.*;
public class electricityBill {
    public double calculate(double units){
        if(units==0) return 0;
        int n=0;
        int unitAlt=(int)units;
        int ans;
        int temp,total=0;
        while(unitAlt!=0){
            temp=unitAlt%10;
            ans=temp*(int)Math.pow(10, n);
            System.out.println(ans);
            if(ans<=100){
                total=total+(ans*10);
            }
            else if(ans>100 && ans<=200){
                total=total+(ans*15);
            }
            else if(ans>200 && ans<=300){
                total=total+(ans*20);
            }
            else if(ans>300){
                total=total+(ans*25);
            }
            else{
                total+=0;
            }
            n++;
            unitAlt=unitAlt/10;


        }
        return total;



    }
    static double calc(double units){
        if(units<=100){
            return units*10;
        }
        else if(units<=200){
            return (100*10)+((units-100)*15);
        }
        else if(units<=300){
            return (100*10)+(100*15)+((units-200)*20);
        }
        else if(units>300){
            return (100*10)+(100*15)+(100*20)+((units-300)*25);
        }
        return 0;
    }

    public static void main(String[] args) {
        electricityBill obj=new electricityBill();
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the number of units :");
        double units=inp.nextDouble();

        System.out.println("Charge :"+calc(units));

    }
    
}
