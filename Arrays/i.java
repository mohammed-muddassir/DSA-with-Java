import java.util.*;
import java.io.*;
public class i {
    public static void main(String[] args) throws IOException{
        BufferedReader inp=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in); 
        String str=String.valueOf(inp.readLine());
        System.out.println(str);
        if(str.equals("Insert")){
            System.out.println("yes");
        }
        inp.close();
    }
}