package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro696 {
    public static int countBinarySubstrings(String s) {
        int ans=0;
        int right=1,left=0;
        int middle=0;
        boolean flag=true;
        while(right<s.length()){
            if(flag&&s.charAt(right)!=s.charAt(left)){
                flag=false;
                middle=right;
            }
            if(!flag&&s.charAt(right)==s.charAt(left)){
                flag=true;
                ans+=Math.min(middle-left,right-middle);
                left=middle;
                middle=right;
                continue;
            }
            right++;
        }
        if(flag==false)
            ans+=Math.min(middle-left,right-middle);
        return ans;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(countBinarySubstrings(s));
    }
}
