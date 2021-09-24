import java.util.regex.*;
import java.util.*;
public class pattern {

    public static void main(String[] args) {
        // Pattern pattern=Pattern.compile(".xx.");
        // Matcher matcher=pattern.matcher("Axxb");
        // System.out.println(matcher.matches());
        Scanner inp=new Scanner(System.in);
        String str1="He is a very very good boy, isn't he?";
        String str=inp.nextLine();
        String[] s;
        int count=0;
        String ans="";
        String regex="[A-Za-z !,?._'@]+";
        s=str.split(regex);
        for(String i:s){
            System.out.println(i);
            // ans=ans+i+"\n";
            // count++;
        }
        // System.out.println(count);
        // System.out.println(ans);


    }
    
}


// String reg="121.234.12.12";
//         boolean check=Pattern.matches("(([.0-9]+)([^a-zA-Z]))",reg);
//         // System.out.println(check);
//         boolean result=true;
//         if(check){
//             String[] temp=reg.split("\\.");
//             System.out.println(temp.length);
//             if(temp.length!=4){
                
//                 result=false;
//             }
//             else{
//                 for(String s:temp){
//                     System.out.println(s);
//                     boolean b=Pattern.matches("(([0-9])([^a-zA-Z]){1,2})", reg);
//                     result=true;
//                 }
//             }
//         }
//         else{
//           result=false;
//         }
//         System.out.println(result);
       
