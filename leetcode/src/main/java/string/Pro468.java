package string;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro468 {
    public static boolean validIPV4(String queryIP){
        if(queryIP.charAt(0)=='.'||queryIP.charAt(queryIP.length()-1)=='.')
            return false;
        String[] strs = queryIP.split("\\.");
        if(strs.length!=4)
            return false;
        for(String str:strs){
            if(str.length()>3||str.length()==0)
                return false;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)<'0'||str.charAt(i)>'9')
                    return false;
            }
            if(str.charAt(0)=='0'&&str.length()!=1)
                return false;
            int temp=Integer.parseInt(str);
            if(temp<0||temp>255)
                return false;
        }
        return true;
    }
    public static boolean validIPV6(String queryIP){
        if(queryIP.charAt(0)==':'||queryIP.charAt(queryIP.length()-1)==':')
            return false;
        String[] strs=queryIP.split(":");
        if(strs.length!=8)
            return false;
        System.out.println(strs.length);
        for(String str:strs){
            if(str.length()<1||str.length()>4)
                return false;
            for(int i=0;i<str.length();i++){
                if(!(str.charAt(i)>='0'&&str.charAt(i)<='9'||str.charAt(i)>='a'&&str.charAt(i)<='f'||str.charAt(i)>='A'&&str.charAt(i)<='F'))
                    return false;
            }
        }
        return true;
    }
    public static String validIPAddress(String queryIP) {
        String ans="";
        if(queryIP.indexOf(':')!=-1){
            if(validIPV6(queryIP)){
                return "IPv6";
            }else{
                return "Neither";
            }
        }
        if(queryIP.indexOf('.')!=-1){
            if(validIPV4(queryIP)){
                return "IPv4";
            }else{
                return "Neither";
            }
        }

        ans="Neither";
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String queryIP = br.readLine();
        System.out.println(validIPAddress(queryIP));
    }
}
