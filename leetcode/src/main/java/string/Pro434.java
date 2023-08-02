package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro434 {
    public static int countSegments(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '&&i-1>=0&&s.charAt(i-1)!=' ')
                ans++;
        }
        return s.charAt(s.length()-1)==' '?ans:ans+1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(countSegments(s));
    }
}
