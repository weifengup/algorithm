package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1309 {
    public static String freqAlphabets(String s) {
        int index=0;
        StringBuilder sb=new StringBuilder();
        while(index<s.length()){
            char temp='a';
            if(index+2<s.length()&&s.charAt(index+2)=='#'){
                temp+=Integer.parseInt(s.substring(index,index+2))-1;
                index+=3;
            }else{
                temp+=Integer.parseInt(s.substring(index,index+1))-1;
                index++;
            }
            sb.append(temp);
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(freqAlphabets(s));
    }
}
