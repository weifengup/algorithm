package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro831 {
    public static String maskEmail(String s){
        StringBuilder sb=new StringBuilder();
        int temp=s.indexOf('@');
        s=s.toLowerCase();
        sb.append(s.charAt(0));
        sb.append("*****");
        sb.append(s.charAt(temp-1));
        sb.append(s.substring(temp));
        return sb.toString();
    }
    public static String maskPhone(String s){
        StringBuilder sb=new StringBuilder();
        int num=0;
        char[] str=new char[4];
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                if(num<4){
                    str[3-num]=s.charAt(i);
                }
                num++;
            }
        }
        if(num>10){
            sb.append("+");
            for(int i=10;i<num;i++){
                sb.append("*");
            }
            sb.append("-");
        }
        sb.append("***-***-");
        sb.append(new String(str));
        return sb.toString();
    }
    public static String maskPII(String s) {
        if(s.charAt(s.length()-1)>='a'&&s.charAt(s.length()-1)<='z'||s.charAt(s.length()-1)>='A'&&s.charAt(s.length()-1)<='Z'){
            return maskEmail(s);
        }
        else{
            return maskPhone(s);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(maskPII(s));
    }
}
