import java.util.*;
import java.math.BigInteger;
public class bigInt{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        BigInteger sum=new BigInteger("0");
        BigInteger mult=new BigInteger("1");
        BigInteger a=inp.nextBigInteger();
        BigInteger b=inp.nextBigInteger();
        // System.out.println(a.longValue());
        sum=sum.add(a).add(b);
        String s=sum.toString();
        s=s.replaceAll("^0(?!$)", s);
        System.out.println(s);
        mult=mult.multiply(a).multiply(b);
        String m=mult.toString();
        m=m.replaceAll("^0(?!$)", m);
        System.out.println(m);


    }
}