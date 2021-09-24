import java.util.regex.Pattern;

import java.util.regex.*;
class MyRegex{
    public boolean find(String reg){
        boolean check=Pattern.matches("(([.0-9]+)([^a-zA-Z]))",reg);
        // System.out.println(check);
        boolean result=true;
        if(check){
            String[] temp=reg.split("\\.");
            // System.out.println(temp.length);
            if(temp.length!=4){
                
                result=false;
            }
            else{
                for(String s:temp){
                    // System.out.println(s);
                    boolean b=Pattern.matches("(([0-9])([^a-zA-Z]){1,2})", reg);
                    result=true;
                }
            }
        }
        else{
           result=false;
        }
       return result;
        
    }
    
}
public class ipaddress {
     
    
    public static void main(String[] args) {
        ipaddress o=new ipaddress();
        MyRegex obj=new MyRegex();
        System.out.println(obj.find("...."));


    }
}

// class myRegex{
//     public String pattern = "((([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5]))\\b";
// }
