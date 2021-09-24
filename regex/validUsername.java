import java.util.regex.Pattern;
import java.util.regex.*;
public class validUsername {
    public static void main(String[] args) {
        String userName="Julia007";
        String regex="(^[a-zA-z&&[^_+-=><?/|)(*&^%$#@!)]][0-9_A-Za-z]{7,30}$)";
        Pattern p=Pattern.compile(regex);
        Matcher match=p.matcher(userName);
        System.out.println(match.groupCount());
        boolean check=Pattern.matches(regex,userName);
        System.out.println(check);

//         Julia
// Samantha
// Samantha_21
// 1Samantha
// Samantha?10_2A
// JuliaZ007
// Julia@007
// _Julia007
    }
    
}
