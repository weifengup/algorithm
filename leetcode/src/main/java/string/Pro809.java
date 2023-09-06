package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro809 {
    public static int expressiveWords(String s, String[] words) {
        int ans=0;
        for(String word:words){
            ans+=isExpressiveWord(s,word)?1:0;
        }
        return ans;
    }
    public static boolean isExpressiveWord(String s,String t){
        int i=0,j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)!=t.charAt(j))
                return false;
            i++;
            j++;
            int a=1,b=1;
            while(i<s.length()&&s.charAt(i)==s.charAt(i-1)){
                i++;
                a++;
            }
            while(j<t.length()&&t.charAt(j)==t.charAt(j-1)){
                j++;
                b++;
            }
            if((a<3&&a!=b)||(a>=3&&a<b))
                return false;

        }
        return i==s.length()&&j==t.length();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] words=new String[n];
        for(int i=0;i<n;i++){
            words[i]=new String();
            words[i]=br.readLine();
        }
        System.out.println("??");
        System.out.println(expressiveWords(s,words));
    }
}
