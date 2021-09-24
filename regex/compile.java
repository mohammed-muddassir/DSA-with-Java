import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.*;
public class compile {
    public static void main(String[] args) throws PatternSyntaxException{
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        String[] str=new String[n];
        if(n==0) return;
        for(int i=0;i<n;i++){
            String regex=inp.next().trim();
            try { 
                    Pattern pattern=Pattern.compile(regex) ;
                    str[i]="valid";
                  
               
            }
            catch(PatternSyntaxException exception){
               str[i]="invalid";
            }
        }
        // ([A-Z])(.+)
        // [AZ[a-z](a-z)
        // batcatpat(nat
        for(String s:str){
            System.out.println(s);
        }

        
       
    }
    
}
