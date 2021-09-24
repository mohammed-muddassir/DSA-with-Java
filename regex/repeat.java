import java.util.regex.*;
import java.util.*;
public class repeat {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=Integer.parseInt(inp.nextLine());
        // String str="am went went to to to his business";
        while(n>0){
            String str=inp.nextLine();
            Pattern pattern=Pattern.compile("\\b(\\w+)(\\s+\\1\\b)*",Pattern.CASE_INSENSITIVE);
            Matcher matcher=pattern.matcher(str);
            while(matcher.find()){
               str=str.replaceAll(matcher.group(0), matcher.group(1));
            }
           System.out.println(str);
            n--;
        }
//         Goodbye bye bye world world world
// Sam went went to to to his business
// Reya is is the the best player in eye eye game
// in inthe
       

    }
}
