package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro58 {
    public static int lengthOfLastWord(String s) {
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                ans++;
            }else{
                if(i+1<s.length()&&s.charAt(i+1)!=' ')
                    return ans;
            }
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(lengthOfLastWord(s));
    }
}
