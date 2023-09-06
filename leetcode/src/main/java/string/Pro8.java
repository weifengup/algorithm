package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro8 {

    public static int myAtoi(String s) {
        int ans=0;
        int index=0;
        boolean positive=true;
        while(index<s.length()){
            if(s.charAt(index)=='+'){
                index++;
                break;
            }else if(s.charAt(index)=='-'){
                positive=false;
                index++;
                break;
            }else if((s.charAt(index)>='0'&&s.charAt(index)<='9')){
                break;
            }else if(s.charAt(index)==' '){
                index++;
            }else{
                return ans;
            }
        }
        for(;index<s.length();index++){
            if(s.charAt(index)!='0')
                break;
        }
        //ans*10+s>max
        //ans*10-s<min
        for(;index<s.length();index++){
            if(s.charAt(index)<'0'||s.charAt(index)>'9')
                break;
            if(positive&&ans>(Integer.MAX_VALUE-(s.charAt(index)-'0'))/10)
                return Integer.MAX_VALUE;
            else if(!positive&&ans<(Integer.MIN_VALUE+(s.charAt(index)-'0'))/10)
                return Integer.MIN_VALUE;
            if(positive)
                ans=ans*10+(s.charAt(index)-'0');
            else
                ans=ans*10-(s.charAt(index)-'0');
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(myAtoi(s));
    }

}
