public class ceasarCipher {
    public static void main(String[] args) {
        String str="muddassir";
        str=str.toUpperCase();
        int k=3;
        char[] st=str.toCharArray();
        int[] asc=new int[st.length];
        for(int i=0;i<st.length;i++){
           asc[i]=(int)st[i];
            asc[i]=(((asc[i]-65)+k)%26);
        }

        for(int s:asc){
            System.out.println((char)(s+65)=='='?"":(char)(s+65));
        }


    }
}
