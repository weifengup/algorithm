package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Pro1324 {
    public static List<String> printVertically(String s) {
        List<String> ans=new ArrayList<>();
        s=s.trim();
        String[] words = s.split(" ");
        int index=0;
        int flag= words.length-1;
        while(flag!=-1){
            int end=flag;
            flag=-1;
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<=end;i++){
                if(words[i].length()>index+1){
                    flag=i;
                    sb.append(words[i].charAt(index));
                }else if(words[i].length()==index+1){
                    sb.append(words[i].charAt(index));
                } else{
                    sb.append(" ");
                }
            }
            ans.add(sb.toString());
            index++;
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        List<String> words = printVertically(s);
        for(String word:words){
            System.out.println(word);
        }
    }
}
