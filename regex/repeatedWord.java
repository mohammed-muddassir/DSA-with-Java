import java.util.*;
import java.util.regex.*;
public class repeatedWord {
    public static void main(String[] args) {
        String x="iove to to to coding";
        // x=str.toLowerCase();
        // boolean b=Pattern.matches("[\\ a-zA-Z]+", x);
        // System.out.println(b);
    //    x=x.trim();
    //    System.out.println(x);
        
       String[] st=x.split(" ");
       for(String s:st){
        x=String.join("",s);
        System.out.println(x);
    }

       
     
       
    Pattern pattern=Pattern.compile("(to){3}", Pattern.CASE_INSENSITIVE);
    Matcher matcher=pattern.matcher(x);
    boolean found=false;
           boolean res=matcher.find();
           System.out.println(res);
        // boolean res=Pattern.matches("\b to \b", x);
        // System.out.println(res);
        // while (matcher.find()) {
        //     System.out.format("I found the text" +
        //         " \"%s\" starting at " +
        //         "index %d and ending at index %d.%n",
        //         matcher.group(),
        //         matcher.start(),
        //         matcher.end());
        //     found = true;
        // }
        // if(!found){
        //     System.out.format("No match found.%n");
        // }
        
      
    }
}
