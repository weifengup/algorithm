package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro551 {
    public static boolean checkRecord(String s) {
        int a=0,l=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                a++;
                l=0;
                if(a>=2)
                    return false;
            }else if(s.charAt(i)=='L'){
                l++;
                if(l>=3)
                    return false;
            }else{
                l=0;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(checkRecord(s));
    }
}
