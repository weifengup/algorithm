package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro1328 {
    public static String breakPalindrome(String palindrome) {
        if(palindrome.length()<=1)
            return "";
        StringBuilder sb=new StringBuilder(palindrome);
        boolean flag=false;
        for(int i=0;i<palindrome.length()/2;i++){
            if(palindrome.charAt(i)>'a'){
                sb.setCharAt(i,'a');
                flag=true;
                break;
            }
        }
        if(!flag){
            if(palindrome.charAt(palindrome.length()-1)>'a')
                sb.setCharAt(palindrome.length()-1,'a');
            else
                sb.setCharAt(palindrome.length()-1,'b');
        }

        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String palindrome = br.readLine();
        System.out.println(breakPalindrome(palindrome));

    }
}
